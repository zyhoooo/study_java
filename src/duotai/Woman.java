package duotai;

/**
 * @Description TODO
 * @ClassName Woman
 * @Author 钟宇豪
 * @Date 2022/2/11 21:08
 * @Version 1.0
 */
public class Woman extends Person {
    boolean isBeauty;

    public void shopping() {
        System.out.println("shopping");
    }

    @Override
    public void eat() {
        System.out.println("woman eat");
    }
}
