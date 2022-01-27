package array;

/**
 * @Description TODO
 * @ClassName ArrayExer02
 * @Author 钟宇豪
 * @Date 2022/1/26 17:13
 * @Version 1.0
 */
/*
打印10行的杨辉三角
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        int[][] yanghui = new int[10][];
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    yanghui[i][j] = 1;
                } else {
                    yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
                }
            }
        }
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
