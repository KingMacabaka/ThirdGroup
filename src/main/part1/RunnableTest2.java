package main.part1;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author xxq
 * @ClassName RunnableTest2
 * @Description TODO
 * @Date 2020/2/23
 * @Version 1.0
 **/
public class RunnableTest2 {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1802343139, "谢晓茜"),
                new Student(1802343104, "韩源"),
                new Student(1111111111, "杨晶"),
                new Student(1231231233, "赵玉杰"),
                new Student(1231231222, "孙文龙"));

        Runnable r1 = () -> list.forEach(Student::toString);
        Thread th1 = new Thread(r1);
        th1.start();

        Runnable r2 = () -> {
            Consumer<Student> style = (Student s) -> System.out.println("Code:" + s.getCode() + ", Student Name:" + s.getName());
            list.forEach(style);
        };
        Thread th2 = new Thread(r2);
        th2.start();
    }
}
