package basic.daimakuai;

/**
 * @Description 代码块（或初始化块）
 * 作用：用来初始化类、对象
 * 如果有修饰的话，只能用static
 * 静态：
 * 内部可以有输出语句
 * 随着类的加载而执行，只执行一次
 *
 * 非静态：
 * 内部可以有输出语句
 * 随着对象的创建而执行，创建一次执行一次
 * 可以在创建对象时，对对象的属性进行初始化
 *
 * @ClassName BlockTest
 * @Author 钟宇豪
 * @Date 2022/4/7 17:12
 * @Version 1.0
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        Person person = new Person();
    }
}

class Person {
    String name;
    int age;
    static String desc = "I am a person";

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //代码块
    static {
        System.out.println("hello static block");
    }

    {
        System.out.println("hello block");
    }

    public void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("sleep");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
