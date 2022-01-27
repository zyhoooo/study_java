package array;

import java.util.Arrays;

/**
 * @Description TODO
 * @ClassName array_tool01
 * @Author 钟宇豪
 * @Date 2022/1/27 11:48
 * @Version 1.0
 */
/*
Arrays工具类
 */
public class array_tool01 {
    public static void main(String[] args) {
        //判断两数组相等
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(Arrays.equals(arr1, arr2)); //true

        //输出数组信息
        System.out.println(Arrays.toString(arr1));

        //将指定值填充到数组中
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1)); //[10,10,10,10]

        //排序
        int[] arr3 = {2, 5, 1, 6};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        //二分查找
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.binarySearch(arr4, 1));
    }
}
