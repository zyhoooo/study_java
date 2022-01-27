package xunhuan;

/**
 * @Description TODO
 * @ClassName for_exer1
 * @Author 钟宇豪
 * @Date 2022/1/22 10:31
 * @Version 1.0
 */
/*
从1循环到150，每行打印一个值
在每个3的倍数行打印foo
在每个5的倍数行打印biz
在每个7的倍数行打印baz
 */
public class for_exer1 {
    public static void main(String[] args) {
        for(int i=1;i<=150;i++){
            System.out.print(i);
            if(i%3==0){
                System.out.print(" foo ");
            }
            if(i%5==0){
                System.out.print(" biz ");
            }
            if(i%7==0){
                System.out.print(" baz ");
            }
            System.out.println();
        }
    }
}
