package part1;

/**
 * @author xxq
 * @ClassName GreetingServiceTest
 * @Description TODO
 * @Date 2020/2/22
 * @Version 1.0
 **/
public class GreetingServiceTest {
    public static void main(String[] args) {
        GreetingService greetingService = message -> {
            System.out.println(message);
            System.out.println(message.substring(2));
        };
        greetingService.sayMessage("hello world");
    }
}
