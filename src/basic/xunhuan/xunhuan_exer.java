package basic.xunhuan;

import java.util.Scanner;

/**
 * @Description TODO
 * @ClassName xunhuan_exer
 * @Author 钟宇豪
 * @Date 2022/1/22 11:25
 * @Version 1.0
 */
/*
输入整数，输入0循环终止
 */
public class xunhuan_exer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        while (i != 0) {
            System.out.println(i);
            i = scan.nextInt();
        }
    }
}
