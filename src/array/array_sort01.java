package array;

/**
 * @Description TODO
 * @ClassName array_sort01
 * @Author 钟宇豪
 * @Date 2022/1/27 11:36
 * @Version 1.0
 */
/*
冒泡排序
 */
public class array_sort01 {
    public static void main(String[] args) {
        int[] arr = {4, 233, 7, 45, -345, 1, -8, 5, 59};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
