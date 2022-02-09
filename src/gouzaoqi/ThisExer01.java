package gouzaoqi;

/**
 * @Description TODO
 * @ClassName ThisExer01
 * @Author 钟宇豪
 * @Date 2022/2/7 16:22
 * @Version 1.0
 */
/*
添加构造器，用this实现构造器的重载
 */
public class ThisExer01 {
    public static void main(String[] args) {
        Boy b1 = new Boy("Jack", 20);
        Girl g1 = new Girl("Lucy", 19);
        Girl g2 = new Girl("Micky", 19);

        b1.marry(g1);
        b1.shout();
        g1.marry(b1);
        g1.compare(g2);
    }
}

class Boy {
    private String name;
    private int age;

    public Boy() {
    }

    public Boy(String name) {
        this.name = name;
    }

    public Boy(int age) {
        this.age = age;
    }

    public Boy(String name, int age) {
        this(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl) {
        System.out.println("marry with " + girl.getName());
    }

    public void shout() {
        System.out.println("shout!");
    }
}

class Girl {
    private String name;
    private int age;

    public Girl(int age) {
        this.age = age;
    }

    public Girl(String name) {
        this.name = name;
    }

    public Girl(String name, int age) {
        this(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Boy boy) {
        System.out.println("marry with " + boy.getName());
    }

    public void compare(Girl girl) {
        System.out.println("compare with " + girl.getName());
    }
}
