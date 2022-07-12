/**
 * @Description TODO
 * @ClassName Test01
 * @Author 钟宇豪
 * @Date 2022/5/7 20:00
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        String[] bank = {"AAAACCCC","AACCCCCC","AAACCCCC"};
        System.out.println(minMutation("AAAAACCC", "AACCCCCC", bank));

    }

    public static int minMutation(String start, String end, String[] bank) {
        // 1.定义变化次数counter
        int counter = 0;
        String mid = start; // start 为 old，mid 为 new
        // 2.定义变化基因数num
        int num = 0;
        // 3.for循环
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < bank.length; i++) {
                num = 0;
                for (int j = 0; j < 8; j++) {
                    if (mid.charAt(j) != bank[i].charAt(j)) {
                        num++;
                    }
                }
                if (num ==1 && start != bank[i]) {
                    start = mid;
                    mid = bank[i];
                    counter++;
                    if (mid == end) {
                        return counter;
                    }
                    break;
                }
                if (i == bank.length - 1) {
                    flag = false;
                }
            }
        }
        return -1;
    }
}
