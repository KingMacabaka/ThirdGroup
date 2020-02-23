package main.part1;

/**
 * @author xxq
 * @ClassName Student
 * @Description TODO
 * @Date 2020/2/23
 * @Version 1.0
 **/

public class Student {
    private Integer code;
    private String name;
    private String sex;

    public Student() {
    }

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public Student(Integer code, String name, String sex) {
        this.code = code;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
