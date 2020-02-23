package main.part5;

/**
 * @author Jack
 * @Date: 2020/2/23 12:48
 * @Description:
 */
public class ConcreteStudent implements  Student{
    private  String name ;
    private  Integer masks;

    @Override
    public void changeMask() {
        if(getMasks()>=1){
            System.out.println(getName()+"戴上口罩了，"+"还剩"+getMasks()+"个口罩");
        }else{
            System.out.println(getName()+"家里穷，实在没有口罩可以戴了");
        }
    }

    @Override
    public void getNotify(ConcreteStudent student) {
        this.masks = student.getMasks()-1;
        changeMask();
    }

    public ConcreteStudent(String name, Integer masks) {
        this.name = name;
        this.masks = masks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMasks() {
        return masks;
    }

    public void setMasks(Integer masks) {
        this.masks = masks;
    }
}
