package main.part1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xxq
 * @ClassName RunnableTest
 * @Description TODO
 * @Date 2020/2/23
 * @Version 1.0
 **/
public class RunnableTest {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println("将展示学生信息");
            List<Student> studentList = new ArrayList<>();
            studentList.add(new Student(1802343139, "谢晓茜"));
            studentList.add(new Student(1802343104, "韩源"));
            studentList.add(new Student(1111111111, "杨晶"));
            studentList.add(new Student(1231231233, "赵玉杰"));
            for (Student student : studentList){
                System.out.println(student.toString());
            }
        });
        thread.start();
    }


}
