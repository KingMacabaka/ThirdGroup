package part3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName TestCallable
 * @Description 计算0到100相加，返回结果 （使用Callable接口）
 * @Author YangJinG
 * @Date 2020/2/23
 **/
public class TestCallable {
    public static void main(String[] args) {
        CallableThreadDemo ctd = new CallableThreadDemo();
        //1.执行Callable方式，需要FutureTask实现类的支持，用于接收运算结果
        FutureTask<Integer> result = new FutureTask<Integer>(ctd);
        new Thread(result).start();
        //2.接收线程运算后的结果
        try {
            //FutureTask 可用于闭锁
            Integer sum = result.get();
            System.out.println(sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
class CallableThreadDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}