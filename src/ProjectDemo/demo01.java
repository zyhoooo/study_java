package ProjectDemo;

import java.util.Scanner;

import static ProjectDemo.Utility.*;

/**
 * @Description TODO
 * @ClassName demo01
 * @Author 钟宇豪
 * @Date 2022/1/23 20:22
 * @Version 1.0
 */
public class demo01 {
    public static void main(String[] args) {
        boolean flag = true; // 用于判断是否退出循环
        int money = 10000; // 初始金额
        String jilu="";

        while (flag) {
            System.out.println("-----------家庭收支记账软件-----------");
            System.out.println();
            System.out.println("            1 收支明细");
            System.out.println("            2 登记收入");
            System.out.println("            3 登记支出");
            System.out.println("            4 退 出");
            System.out.print("            请选择(1-4):");

            Scanner scan = new Scanner(System.in);

            switch (readMenuSelection()) {
                case '1':
                    System.out.println("-----------当前收支明细记录-----------");
                    System.out.println("收支\t账户金额\t收支金额\t说 明");
                    System.out.println(jilu);
                    System.out.println("-----------------------------------");
                    break;
                case '2':
                    System.out.print("本次收入金额：");
                    int income = readNumber();
                    System.out.print("本次收入说明：");
                    String income_describe = readString();
                    money += income;
                    jilu+="收入\t"+money+"\t"+income+"\t"+income_describe+"\n";
                    System.out.println("-----------------------------------");
                    break;
                case '3':
                    System.out.print("本次支出金额：");
                    int out = readNumber();
                    System.out.print("本次支出说明：");
                    String out_describe = readString();
                    money -= out;
                    jilu+="支出\t"+money+"\t"+out+"\t"+out_describe+"\n";
                    System.out.println("-----------------------------------");
                    break;
                case '4':
                    System.out.print("是否退出?(Y/N)");
                    char isQuit = readConfirmSelection();
                    if (isQuit == 'Y') {
                        flag = false;
                    }
                    break;
            }
        }
    }
}
