package basic.fengzhuang;

/**
 * @Description TODO
 * @ClassName ExerDemo01
 * @Author 钟宇豪
 * @Date 2022/1/29 16:16
 * @Version 1.0
 */
/*
定义两个类:Person和PersonTest类，用setAge()设置人的合法化年龄(0~130)，getAge()返回年龄
在PersonTest类中实例化Person类的对象b，调用setAge()和getAge()方法
 */
public class ExerDemo01 {

}

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 130) this.age = age;
        else this.age = 0;
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person b = new Person();
        b.setAge(190);
        System.out.println(b.getAge());
    }
}
