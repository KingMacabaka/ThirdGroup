package part2;

/**
 * @author Yujie_Zhao
 * @ClassName Student
 * @Description TODO
 * @Date 2020/2/23  0:54
 * @Version 1.0
 **/

import java.util.Comparator;

/**
 * 调用一个接口，接口的对象是对Student进行比较，
 * 比较是比较code，而不是其他的东西，所以要调用。
 */
public class Student{

    private int Code;
    private String Name;
    private String Sex;

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Code=" + Code +
                ", Name='" + Name + '\'' +
                ", Sex='" + Sex + '\'' +
                '}';
    }


    public Student(int code , String name, String sex) {
        this.Code = code;
        this.Name = name;
        this.Sex = sex;
    }

}