/**
 * @Description TODO
 * @ClassName StingTest
 * @Author 钟宇豪
 * @Date 2021/11/28 10:45
 * @Version 1.0
 */
/*
String属于引用数据类型,字符串，使用时需要加 ""

 */
public class StingTest {
    public static void main(String[] args) {
        String s1 = "hello world";
        System.out.println(s1);

        //连接操作
        int number = 1001;
        String s2 = "学号：";
        String info = s2 + number; // 连接运算，运算结果也是String类型
        boolean b1 = true;
        String info2 = info + b1;
        System.out.println(info2);

    }
}
