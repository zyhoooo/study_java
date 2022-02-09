package faceToObj;

/**
 * @Description TODO
 * @ClassName ObjDiguiExer01
 * @Author 钟宇豪
 * @Date 2022/1/29 14:14
 * @Version 1.0
 */
/*
f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),求f(10)
 */
public class ObjDiguiExer01 {

    public static void main(String[] args) {
        ObjDiguiExer01 d = new ObjDiguiExer01();
        System.out.println(d.f(2));
    }

    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }

}
