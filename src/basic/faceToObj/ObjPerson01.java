package basic.faceToObj;

/**
 * @Description TODO
 * @ClassName ObjPerson01
 * @Author 钟宇豪
 * @Date 2022/1/27 15:10
 * @Version 1.0
 */
/*
属性：对应类中的成员变量
行为：对应类中的成员方法
 */
public class ObjPerson01 {
    /**
     * 测试类
     *
     * @param args
     */
    public static void main(String[] args) {
        //创建person类的对象
        Person p1 = new Person();

        //调用对象的结构
        p1.name = "Mick";
        p1.age = 1;
        p1.isMail = true;
        System.out.println(p1.name);

        p1.eat();

        Person p2 = new Person();
        System.out.println(p2.name); //null

        Person p3 = p1;
        System.out.println(p3.name); //Mick
        p3.age = 10;
        System.out.println(p1.age); //10
    }
}

class Person {

    //属性
    String name;
    int age;
    boolean isMail;

    //方法
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void speak() {
        System.out.println("说话");
    }

}

