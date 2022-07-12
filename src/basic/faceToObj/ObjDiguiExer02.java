package basic.faceToObj;

/**
 * @Description TODO
 * @ClassName ObjDiguiExer02
 * @Author 钟宇豪
 * @Date 2022/1/29 14:21
 * @Version 1.0
 */
/*
计算斐波那契数列的第n个值并打印整个数列
1 1 2 3 5 8 13 21 34 55 ...
 */
public class ObjDiguiExer02 {

    public static void main(String[] args) {
        ObjDiguiExer02 d = new ObjDiguiExer02();
        System.out.println(d.feibonaqi(7));
    }

    public int feibonaqi(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return feibonaqi(n - 1) + feibonaqi(n - 2);
        }
    }

}
