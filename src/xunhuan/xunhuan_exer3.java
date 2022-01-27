package xunhuan;

/**
 * @Description TODO
 * @ClassName xunhuan_exer3
 * @Author 钟宇豪
 * @Date 2022/1/23 11:16
 * @Version 1.0
 */
/*
输出九九乘法表
 */
public class xunhuan_exer3 {
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" * "+i+" = "+j*i+"\t");
            }
            System.out.println();
        }
    }
}
