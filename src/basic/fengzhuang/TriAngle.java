package basic.fengzhuang;

/**
 * @Description TODO
 * @ClassName TriAngle
 * @Author 钟宇豪
 * @Date 2022/1/29 17:03
 * @Version 1.0
 */
/*
声明私有的底边长base和高height，声明公共方法访问私有变量，提供必要的构造器
在另一个类中调用
 */
public class TriAngle {
    private double base;
    private double height;

    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public TriAngle() {
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
