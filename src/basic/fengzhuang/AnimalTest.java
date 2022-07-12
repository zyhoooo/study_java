package basic.fengzhuang;

/**
 * @Description TODO
 * @ClassName AnimalTest
 * @Author 钟宇豪
 * @Date 2022/1/29 15:55
 * @Version 1.0
 */
/*
封装与隐藏
封装可以限制属性的赋值条件
java规定的四种权限：private 缺省 protected public
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
//        a.name = "dog";
//        a.age = 2;
//        a.legs = 4;
        a.setName("dog");
        a.setAge(2);
        a.setLegs(4);
        a.eat();
        a.show();
    }
}

class Animal {
    private String name;
    private int age;
    private int legs;

    public void setLegs(int legs) {
        if (legs > 0) this.legs = legs;
        else this.legs = 0;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void eat() {
        System.out.println("eat");
    }

    public void show() {
        System.out.println(this.name + "\t" + this.age + "\t" + this.legs);
    }
}
