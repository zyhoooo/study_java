package staticexer;

/**
 * @Description TODO
 * @ClassName CircleTest
 * @Author 钟宇豪
 * @Date 2022/3/30 9:18
 * @Version 1.0
 */
public class CircleTest {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println(c1.getId());
        System.out.println(c2.getId());

        System.out.println(Circle.getTotal());

    }

}

class Circle {

    private double radius;
    private int id;

    public Circle(){
        id = init++;
        total++;
    }

    private static int total;
    private static int init = 1001;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public double findArea(){
        return 3.14 * radius * radius;
    }

    public static int getTotal() {
        return total;
    }
}
