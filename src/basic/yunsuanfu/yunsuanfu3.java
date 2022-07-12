package basic.yunsuanfu;

/**
 * @Description TODO
 * @ClassName yunsuanfu3
 * @Author 钟宇豪
 * @Date 2022/1/20 14:06
 * @Version 1.0
 */
/*
比较运算符：== != < > <= >= instanceof
 */
public class yunsuanfu3 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        System.out.println(i == j); // false
        System.out.println(i = j); // 20

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 == b2);
        System.out.println(b2 = b1);
    }
}
