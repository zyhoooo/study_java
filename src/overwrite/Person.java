package overwrite;

/**
 * @Description TODO
 * @ClassName Person
 * @Author 钟宇豪
 * @Date 2022/2/9 12:01
 * @Version 1.0
 */
public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("sleep");
    }
}
