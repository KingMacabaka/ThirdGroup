<<<<<<< HEAD:src/main/part3/test.java
package main.part3;
=======
package part2;
import java.util.ArrayList;
import java.util.List;
>>>>>>> 53a98d0e9bce9464d613a853097c2e4b17ea3e32:src/java/part2/test.java

/**
 * @author Yujie_Zhao
 * @ClassName test
 * @Description 测试
 * @Date 2020/2/23  0:54
 * @Version 1.0
 **/

public class test{

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>() {
            {
                add(new Student(1001, "路飞", "M"));
                add(new Student(1005, "明哥", "M"));
                add(new Student(1000, "娜美", "M"));
            }
        };
        students.sort(new Rank());
        for (Student student:students) {
            System.out.println(student.toString());
        }

    }
}