package yunsuanfu;

/**
 * @Description TODO
 * @ClassName yunsaunfu1
 * @Author 钟宇豪
 * @Date 2022/1/19 17:13
 * @Version 1.0
 */
/*
算数运算符：+ - * / % ++ --
 */
public class yunsuanfu1 {

    public static void main(String[] args) {
        // 除
        int num1 = 12;
        int num2 = 5;
        int result = num1 / num2;
        System.out.println(result); // 2

        int result2 = num1 / num2 * num2;
        System.out.println(result2); // 10

        double result3 = num1 / num2;
        System.out.println(result3); // 2.0

        double result4 = num1 / ( num2 + 0.0);
        System.out.println(result4); // 2.4


        // 取模 %
        int mod = num1 / num2;
        System.out.println(mod); // 2
    }

}
