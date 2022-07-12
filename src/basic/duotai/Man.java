package basic.duotai;

/**
 * @Description TODO
 * @ClassName Man
 * @Author 钟宇豪
 * @Date 2022/2/11 21:00
 * @Version 1.0
 */
public class Man extends Person {
    boolean isSmoking;

    public void earnMoney() {
        System.out.println("money");
    }

    @Override
    public void eat() {
        System.out.println("man eat");
    }


}
