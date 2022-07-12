package basic;

/**
 * @Description TODO
 * @ClassName basic.Demo01
 * @Author 钟宇豪
 * @Date 2022/4/25 21:33
 * @Version 1.0
 */
public class Demo01 {
    public static void main(String[] args) {

        int n = 0, n_length = 0, ln = 0, rn = 0;
        String sn = "", sn_l = "", sn_r = "";

        for (int i = 4; i*i < 1000000; i++) {
            n = i * i;

            // int -> basic.String
            sn = String.valueOf(n);

            // 计算n的位数
            n_length = sn.length();

            // 能将n从中间切分则进行下一步判断，不能则一定不是雷劈数
            if (n_length  % 2 == 0){

                // 从中间切分n
                sn_l = sn.substring(0, n_length/2);
                sn_r = sn.substring(n_length/2, n_length);

                // basic.String -> int
                ln = Integer.parseInt(sn_l);
                rn = Integer.parseInt(sn_r);

                if (ln + rn == i){
                    System.out.println(n);
                }
            }
        }
    }
}
