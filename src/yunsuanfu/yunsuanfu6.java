package yunsuanfu;

/**
 * @Description TODO
 * @ClassName yunsuanfu6
 * @Author 钟宇豪
 * @Date 2022/1/20 15:17
 * @Version 1.0
 */
/*
三元运算符： (条件表达式)?表达式1:表达式2
条件为真执行表达式1，为假执行表达式2
三元运算符可以嵌套使用
 */
public class yunsuanfu6 {
    public static void main(String[] args) {
        // 获取两个整数的较大值
        int m = 12;
        int n = 5;
        int max = (m > n) ? m : n;
        System.out.println(max);
    }
}
