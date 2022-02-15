package jicheng;

/**
 * @Description TODO
 * @ClassName Student
 * @Author 钟宇豪
 * @Date 2022/2/9 11:35
 * @Version 1.0
 */
public class Student extends Person {
    String name;
    int age;
    String major;

    public Student() {
    }

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void study() {
        System.out.println("study");
    }
}
