package xunhuan;

/**
 * @Description TODO
 * @ClassName xinhuan_while
 * @Author 钟宇豪
 * @Date 2022/1/22 11:19
 * @Version 1.0
 */
/*
while循环
 */
public class xinhuan_while {
    public static void main(String[] args) {
        boolean flag = true;
        int i = 0;
        while (flag) {
            System.out.println("I love JL" + i);
            i++;
            if (i == 10)
                flag=false;
        }
    }
}
