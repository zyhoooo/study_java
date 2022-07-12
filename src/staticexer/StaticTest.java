package staticexer;

/**
 * @Description 用来修饰：属性、方法、代码块、内部类
 * 属性：静态属性 与 非静态属性(实例变量)
 * static修饰的变量也叫 类变量
 * 由于类只会加载一次，则静态变量也只会加载一次
 *
 * 方法：
 * 静态的方法中只能调用静态的方法，非静态的方法中都可以调
 * 在静态方法中，不能使用this关键字、super关键字
 *
 * 属性若可以被多个对象共享，便可以声明为静态
 * 工具类中的方法，习惯上声明为static
 *
 * @ClassName StaticTest
 * @Author 钟宇豪
 * @Date 2022/3/26 19:54
 * @Version 1.0
 */
public class StaticTest {

    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;
        c1.nation = "CHN";

        Chinese c2 = new Chinese();
        c2.name = "马龙";
        c2.age = 30;
        System.out.println(c2.nation);

        System.out.println(Chinese.nation);
        Chinese.show();

    }

}

class Chinese{
    String name;
    int age;
    static String nation;

    public void eat(){

    }

    public static void show(){

    }
}
