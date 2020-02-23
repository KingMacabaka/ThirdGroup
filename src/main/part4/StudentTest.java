package main.part4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wl_sun
 * @description TODO
 * @create Date
 */
public class StudentTest {
public static void main(String[] args) {
    List<Student> studentList =
            new ArrayList<Student>(Arrays.asList(new Student("小张", 12), new Student("小王", 20), new Student("小文", 14)));
    List<Student> sortByAge = studentList.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
    //按年龄排序
    for(Student student:sortByAge){
        System.out.println(student.getName()+"  "+student.getAge());
    }
    //学生个数(名字以小开头的）
    long num = studentList.stream().filter((student) ->student.getName().startsWith("小")).count();
    System.out.println(num);
}
}
