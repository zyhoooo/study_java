package basic.overwrite;

/**
 * @Description 子类对象实例化的全过程：
 * 子类继承父类后，就获取了父类中声明的属性和方法；创建子类的对象，在堆空间中，就会加载所有父类中声明的属性
 * 当我妈通过子类的构造器创建子类的对象时，一定会直接或间接的调用其父类的构造器
 * @ClassName basic.Test
 * @Author 钟宇豪
 * @Date 2022/2/9 12:03
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        student.eat();
    }
}
