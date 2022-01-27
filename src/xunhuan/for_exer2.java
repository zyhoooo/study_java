package xunhuan;

import java.util.Scanner;

/**
 * @Description TODO
 * @ClassName for_exer2
 * @Author 钟宇豪
 * @Date 2022/1/22 11:07
 * @Version 1.0
 */
/*
输入两个正整数m和n，求最大公约数和最小公倍数
 */
public class for_exer2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max=0,min=0;
        System.out.println("输入第一个整数：");
        int m = scan.nextInt();
        System.out.println("输入第二个整数：");
        int n = scan.nextInt();
        for(int i=((m>n)?n:m)/2;i>1;i--){
            if(m%i==0 && n%i==0){
                max=i;
                break;
            }
        }
        min=(m/max)*(n/max)*max;
        System.out.println(max+","+min);
    }
}
