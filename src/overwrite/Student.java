package overwrite;

/**
 * @Description TODO
 * @ClassName Student
 * @Author 钟宇豪
 * @Date 2022/2/9 12:01
 * @Version 1.0
 */
public class Student extends Person {
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

    @Override
    public void eat(){
        System.out.println("stu eat");
    }
}
