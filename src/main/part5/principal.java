package  main.part5;

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
        List<main.part5.ConcreteStudent> studentList = new ArrayList<>(
                Arrays.asList(
                        new main.part5.ConcreteStudent( "谢晓茜",2),
                        new main.part5.ConcreteStudent("杨晶",2),
                        new main.part5.ConcreteStudent("孙文龙",3),
                        new main.part5.ConcreteStudent("赵玉杰",8),
                        new main.part5.ConcreteStudent("韩源",2)
        ));
        main.part5.School school = message ->{
            System.out.println(message);
            studentList.forEach(student -> {
                student.getNotify(student);
            });
        };

        school.WearMask("学校通知：每个人必须戴口罩，并且汇报自己还剩多少口罩");
    }

}
