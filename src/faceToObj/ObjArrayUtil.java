package faceToObj;

/**
 * @Description TODO
 * @ClassName ObjArrayUtil
 * @Author 钟宇豪
 * @Date 2022/1/28 20:30
 * @Version 1.0
 */
/*
自定义数组的工具类
 */
public class ObjArrayUtil {


    //求数组最大值
    public int getMax(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
