package main.part1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xxq
 * @ClassName FunctionalInterfaceDemo
 * @Description 策略模式结合函数式
 * @Date 2020/2/23
 * @Version 1.0
 **/
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        List<Student> sexFilterList = select(getMember(), m -> m.getSex().equals("女"));

        System.out.println("所有成员：");
        System.out.println(getMember());
        System.out.println("过滤后的成员：");
        System.out.println(sexFilterList);
    }

    //过滤器接口
    @FunctionalInterface
    interface Filter {
        boolean filter(Student student);
    }

    //实现类，对人员按照某种标准过滤
    class SexFilter implements Filter {
        @Override
        public boolean filter(Student student) {
            return student.getSex().equals("女");
        }
    }

    //给用户提供的静态方法
    static List<Student> select(List<Student> lists, Filter f){
        List<Student> result = new ArrayList<>();
        for(Student s:lists){
            if(f.filter(s)){
                result.add(s);
            }
        }
        return result;
    }

    //存放第三组所有成员的方法
    static List<Student> getMember() {
        List<Student> students = new ArrayList<>(5);
        students.add(new Student(1802343139, "谢晓茜","女"));
        students.add(new Student(1802343104, "韩源","女"));
        students.add(new Student(1111111111, "杨晶","男"));
        students.add(new Student(1231231233, "赵玉杰","男"));
        students.add(new Student(1231231222, "孙文龙","男"));
        return students;
    }

}
