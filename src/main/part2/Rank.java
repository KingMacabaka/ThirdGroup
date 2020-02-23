package main.part2;

import java.util.Comparator;

/**
 * @author Yujie_Zhao
 * @ClassName Rank
 * @Description 继承Comparator比较排序，实现compare方法
 * @Date 2020/2/23  10:34
 * @Version 1.0
 **/
public class Rank  implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCode()-o2.getCode();
    }
}
