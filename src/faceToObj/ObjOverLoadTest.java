package faceToObj;

/**
 * @Description TODO
 * @ClassName ObjOverLoadTest
 * @Author 钟宇豪
 * @Date 2022/1/29 11:00
 * @Version 1.0
 */
/*
方法的重载
定义：在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可
 */
public class ObjOverLoadTest {

    public void getSum(int i, int j) {
        System.out.println(i + j);
    }

    public void getSum(double d1, double d2) {
        System.out.println(d1 + d2);
    }

}
