package part3;

/**
 * @ClassName ArrMaxValue
 * @Description  函数式接口的Demo
 * @Description 使用supplier函数式接口求数组的最大值
 * @Author YangJinG
 * @Date 2020/2/23
 **/

import java.util.function.Supplier;


public class ArrMaxValue {

    public static int getMaxValue(Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        // 创建数组
        int[] arr = {100,20,50,30,99,101,-50};

        int maxValue = getMaxValue(()->{
            int max = arr[0];
            for (int i : arr) {
                if(i > max){
                    max = i;
                }
            }
            return max;
        });
        System.out.println("数组中的最大值为:" + maxValue);
    }

}