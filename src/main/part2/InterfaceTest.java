package main.part2;

/**
 * @author Yujie_Zhao
 * @ClassName InterfaceTest
 * @Description TODO
 * @Date 2020/2/23  18:35
 * @Version 1.0
 **/
public class InterfaceTest {
    public static void main(String[] args) {
        Interface anInterface = message -> {
            System.out.println(message);
            System.out.println(message.substring(2));
        };
        anInterface.sayMessage("hello Java");
    }
}
