package basic;

import java.util.Scanner;

/**
 * @Description 1第一个符号为英文字母或下划线；
 * 2从第二个符号起，可以为英文字母、下划线、数字；
 * 3标识符长度为[1,10]
 * @ClassName basic.Test
 * @Author 钟宇豪
 * @Date 2022/4/2 12:31
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();
        }
        quickSort(arr, 0, 5);
        System.out.println(binarySearch(arr, n));

    }

    public static int binarySearch(int[] arr, int num){
        //非递归折半查找
        int low = 0, high = arr.length - 1, mid = 0;
        while (low <= high){
            mid = (low + high) / 2;
            if (num == arr[mid])
                return mid;
            else if (num < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static int partition(int[] arr, int low, int high){
        int i=low ;
        int j=high;
        int pivot=arr[low];//基准元素
        while(i<j) {
            while (i < j && arr[j] > pivot) //向左扫描
                j--;

            if (i < j) {
                swap(arr, i++, j);
            }
            while (i < j && arr[i] <= pivot) {//向右扫描
                i++;
            }
            if (i < j) {
                swap(arr, i, j--);
            }
        }
        return i;
    }

    public static void quickSort(int[] arr, int low, int high){
        int mid;
        if (low < high){
            mid = partition(arr, low, high);
            quickSort(arr, low, mid - 1);
            quickSort(arr, mid + 1, high);
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}


