package basic.keybord_in;

import java.util.Scanner;

/**
 * @Description TODO
 * @ClassName ScannerExer1
 * @Author 钟宇豪
 * @Date 2022/1/20 18:16
 * @Version 1.0
 */
/*
输入一个成绩，
100分奖励一辆BMW；
(80-99]奖励iphone 13；
(60-80]奖励ipad
其他时没有奖励
 */
public class ScannerExer1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score =scan.nextInt();
        if(score==100){
            System.out.println("一台bmw");
        }else if(score>80 &&score<=99){
            System.out.println("一台iPhone13");
        }else if(score>60&&score<=80){
            System.out.println("ipad");
        }else{
            System.out.println("无");
        }
    }
}
