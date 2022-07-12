package basic.array;

/**
 * @Description TODO
 * @ClassName array02
 * @Author 钟宇豪
 * @Date 2022/1/26 16:34
 * @Version 1.0
 */
/*
二维数组
 */
public class array02 {
    public static void main(String[] args) {
        //声明和初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        int[][] arr2 = new int[3][2];
        int[][] arr3 = new int[3][];
        int[][] arr4 = {{1, 2, 3}, {1, 1, 1}};

        //调用
        System.out.println(arr1[1][1]); //3
        System.out.println(arr2[1][1]); //0
        System.out.println(arr3[1]); //null

        //遍历
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
