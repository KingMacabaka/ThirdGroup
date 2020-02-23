package main.part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jack
 * @Date: 2020/2/23 12:45
 * @Description:
 */
public class principal {
    public static void main(String[] args) {
        List<ConcreteStudent> studentList = new ArrayList<>(
                Arrays.asList(
                        new ConcreteStudent( "谢晓茜",2),
                        new ConcreteStudent("杨晶",0),
                        new ConcreteStudent("孙文龙",3),
                        new ConcreteStudent("赵玉杰",8),
                        new ConcreteStudent("韩源",2)
        ));
        School school = message ->{
            System.out.println(message);
            studentList.forEach(student -> {
                student.getNotify(student);
            });
        };

        school.WearMask("学校通知：每个人必须戴口罩，并且汇报自己还剩多少口罩");
    }

}
