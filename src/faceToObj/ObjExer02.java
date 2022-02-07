package faceToObj;

/**
 * @Description TODO
 * @ClassName ObjExer02
 * @Author 钟宇豪
 * @Date 2022/1/27 16:09
 * @Version 1.0
 */
/*
设计类Circle计算圆的面积
 */
public class ObjExer02 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.r = 2;
        System.out.println(c1.getS());
    }
}

class Circle {

    double r;

    public double getS() {
        return r * r * 3.1415926;
    }

}
