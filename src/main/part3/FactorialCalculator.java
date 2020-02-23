package main.part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @ClassName FactorialCalculator
 * @Description 计算多个数字的阶层
 * @Author YangJinG
 * @Date 2020/2/23
 **/
public class FactorialCalculator implements Callable<Integer> {

    private int number;

    public FactorialCalculator(int number) {
        super();
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        if(number == 0 || number == 1) {
            result = 1;
        }else{
            for(int i = 2; i <= number; i++) {
                result *= i;
                TimeUnit.MILLISECONDS.sleep(20);
            }
        }
        System.out.printf("%s: %d\n",Thread.currentThread().
                getName(),result);
        return result;
    }

    public static void main(String[] args) {
        ThreadPoolExecutor execute = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        List<Future<Integer>> results = new ArrayList<Future<Integer>>();
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            int number = random.nextInt(20);
            FactorialCalculator calcu = new FactorialCalculator(number);
            Future<Integer> result = execute.submit(calcu);
            results.add(result);
        }

        do{
            System.out.printf("Main: Number of Completed Tasks:%d\n",execute.getCompletedTaskCount());
            for (int i=0; i<results.size(); i++) {
                Future<Integer> result=results.get(i);
                System.out.printf("Main: Task %d: %s\n",i,result.isDone());
            }
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while(execute.getCompletedTaskCount() < results.size());

        System.out.printf("Main: Results\n");
        for(Future<Integer> fus : results) {
            try {
                System.out.printf("Main: Task %d: %d\n",1,fus.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        execute.shutdown();
    }
}