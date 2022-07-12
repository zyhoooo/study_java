package basic.faceToObj;

/**
 * @Description TODO
 * @ClassName ObjOverLoadExer01
 * @Author 钟宇豪
 * @Date 2022/1/29 11:18
 * @Version 1.0
 */
/*
定义三个重载方法mOL，分别接收一个int，两个int，一个字符串，分别执行平方运算并输出结果、相乘并输出结果、输出字符串信息
在main中分别调用三个方法

定义三个重载方法max()
第一个方法求两个int值中的最大值
第二个方法求两个double值中的最大值
第三个方法求三个double值中的最大值
 */
public class ObjOverLoadExer01 {

    public static void main(String[] args) {
        ObjOverLoadExer01 o1 = new ObjOverLoadExer01();
        o1.mOL(2);
        o1.mOL(2, 3);
        o1.mOL("sa");

        System.out.println(o1.max(1, 2));
        System.out.println(o1.max(1.1, 1.2));
        System.out.println(o1.max(1.1, 1.2, 2.3));
    }

    public int max(int i, int j) {
        return (i > j) ? i : j;
    }

    public double max(double i, double j) {
        return (i > j) ? i : j;
    }

    public double max(double i, double j, double k) {
        return (((i > j) ? i : j) > k) ? ((i > j) ? i : j) : k;
    }

    public void mOL(int i) {
        System.out.println(i * i);
    }

    public void mOL(int i, int j) {
        System.out.println(i * j);
    }

    public void mOL(String s) {
        System.out.println(s.toString());
    }

}
