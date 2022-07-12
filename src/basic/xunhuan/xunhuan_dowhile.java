package basic.xunhuan;

/**
 * @Description TODO
 * @ClassName xunhuan_dowhile
 * @Author 钟宇豪
 * @Date 2022/1/22 11:22
 * @Version 1.0
 */
/*
do-while循环
 */
public class xunhuan_dowhile {
    public static void main(String[] args) {
        boolean flag = true;
        int i = 0;
        do {
            System.out.println("I love JL" + i);
            i++;
            if (i == 10)
                flag = false;
        } while (flag);
    }
}
