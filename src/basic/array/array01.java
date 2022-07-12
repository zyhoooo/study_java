package basic.array;

/**
 * @Description TODO
 * @ClassName array01
 * @Author 钟宇豪
 * @Date 2022/1/26 14:36
 * @Version 1.0
 */
/*
数组：数字名、元素、索引、数组的长度
 */
public class array01 {
    public static void main(String[] args) {
        //一维数组的练习

        //声明，数组一旦初始化，其长度就确定了
        int[] ids;
        ids = new int[]{1001, 1002, 1003}; //静态初始化，直接给出数组元素
        String[] names = new String[4]; //动态初始化，定义数组长度

        //通过角标调用 / 赋值数组元素
        names[0]="Tony";
        names[1]="Amy";
        names[2]="John";
        names[3]="Jack";
//        names[4]="mick"; //超出长度

        //获取数组的长度：length属性；长度一旦确定不可修改
        System.out.println(names.length); //4
        System.out.println(ids.length); //3

        //数组的遍历
        for(int i=0;i< names.length;i++){
            System.out.println(names[i]);
        }

        //数组元素的默认初始化值
        int[] arr1=new int[4]; //数字0
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        String[] arr2=new String[4]; //null
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        char[] arr3=new char[4]; //ASCII码的0
        for (int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }

        boolean[] arr4=new boolean[4]; //false
        for (int i=0;i<arr4.length;i++){
            System.out.println(arr4[i]);
        }
    }
}
