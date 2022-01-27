package xunhuan;

/**
 * @Description TODO
 * @ClassName xunhuan_exer4
 * @Author 钟宇豪
 * @Date 2022/1/23 11:20
 * @Version 1.0
 */
/*
输出100以内的质数
 */
public class xunhuan_exer4 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    break;
                }
                if(i==j){
                    System.out.println(i);
                }
            }
        }
    }
}
