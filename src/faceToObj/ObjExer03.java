package faceToObj;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @ClassName ObjExer03
 * @Author 钟宇豪
 * @Date 2022/1/27 16:16
 * @Version 1.0
 */
/*
打印10*8的*型矩阵
计算矩阵面积，作为返回值接收并打印
提供m n两个参数，打印m*n型矩阵，计算面积并打印
 */
public class ObjExer03 {
    public static void main(String[] args) {
        ObjExer03 test = new ObjExer03();
        System.out.println(test.method(10, 8));
    }

    public int method(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}


