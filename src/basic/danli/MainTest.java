package basic.danli;

/**
 * @Description
 * main()方法作为程序的入口
 * main()方法也是一个静态方法
 * main()方法也可以作为我们与控制台交互的方式（之前使用scanner）
 * @ClassName MainTest
 * @Author 钟宇豪
 * @Date 2022/4/7 16:54
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
//        Main.main(new basic.String[10]);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            args[i] = "args_" + i;
            System.out.println(args[i]);
        }
    }
}
