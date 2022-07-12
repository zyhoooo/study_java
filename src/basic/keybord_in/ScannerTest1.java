package basic.keybord_in;

import java.util.Scanner;

/**
 * @Description TODO
 * @ClassName ScannerTest1
 * @Author 钟宇豪
 * @Date 2022/1/20 16:37
 * @Version 1.0
 */
/*
从键盘获取不同类型的变量
 */
public class ScannerTest1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc1.nextInt();
        System.out.println(num);

        String name = sc1.next();
        System.out.println(name);
    }
}
