package basic.jicheng;

/**
 * @Description 继承：提高代码的复用性，便于功能的扩展
 * class A extends B{}
 * 一个子类只能有一个父类，一个父类能有多个子类
 * @ClassName ExtendsTest
 * @Author 钟宇豪
 * @Date 2022/2/9 11:38
 * @Version 1.0
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();

        person.eat();
        student.eat();
    }
}
