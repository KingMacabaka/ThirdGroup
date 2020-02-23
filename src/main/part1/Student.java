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

    public Student() {
    }

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return code + " " + name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
