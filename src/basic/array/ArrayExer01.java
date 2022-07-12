package basic.array;

import java.util.Scanner;

/**
 * @Description TODO
 * @ClassName ArrayExer01
 * @Author 钟宇豪
 * @Date 2022/1/26 16:14
 * @Version 1.0
 */
/*
从键盘读入学生成绩，找出最高分并输出学生成绩等级
>=最高分-10 A
>=最高分-20 B
>=最高分-30 C
其他 D
先读入学生人数
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("请输入学生人数：");
        int stu_num=scan.nextInt(); //学生人数
        int[] stu_score=new int[stu_num];
        int stu_score_max=0; //成绩最高分

        //输入学生成绩
        System.out.println("请输入学生成绩：");
        for(int i=0;i<stu_num;i++){
            stu_score[i]=scan.nextInt();
            if(stu_score_max <stu_score[i]){ //判断最高分
                stu_score_max=stu_score[i];
            }
        }

        for(int i=0;i<stu_num;i++){
            switch ((stu_score_max-stu_score[i])/10){
                case 0:
                    System.out.println("学生"+i+"成绩等级为A");
                    break;
                case 1:
                    System.out.println("学生"+i+"成绩等级为B");
                    break;
                case 2:
                    System.out.println("学生"+i+"成绩等级为C");
                    break;
                default:
                    System.out.println("学生"+i+"成绩等级为D");
                    break;
            }
        }
    }
}
