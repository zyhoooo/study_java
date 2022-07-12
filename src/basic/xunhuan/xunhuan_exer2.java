package basic.xunhuan;

/**
 * @Description TODO
 * @ClassName xunhuan_exer2
 * @Author 钟宇豪
 * @Date 2022/1/23 11:14
 * @Version 1.0
 */
/*
输出
*
**
***
****
*****
 */
public class xunhuan_exer2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
