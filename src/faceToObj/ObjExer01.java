package faceToObj;

/**
 * @Description TODO
 * @ClassName ObjExer01
 * @Author 钟宇豪
 * @Date 2022/1/27 16:02
 * @Version 1.0
 */
/*
创建一个Person类
 */
public class ObjExer01 {
    public static void main(String[] args) {

        Person1 p1 = new Person1();
        p1.name = "Mike";
        p1.age = 10;
        p1.sex = 1;

        p1.study();
        p1.showAge();
        p1.age = p1.addAge(2);
        p1.showAge();

    }
}

class Person1 {

    String name;
    int age;
    int sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println(this.age);
    }

    public int addAge(int i) {
        return this.age + i;
    }
}
