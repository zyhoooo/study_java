package faceToObj;

/**
 * @Description TODO
 * @ClassName ObjDigui
 * @Author 钟宇豪
 * @Date 2022/1/29 14:08
 * @Version 1.0
 */
/*
递归方法的调用
 */
public class ObjDigui {

    public static void main(String[] args) {
        ObjDigui d = new ObjDigui();
        int sum = d.getSum(3);
        System.out.println(sum);
    }

    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }

}
