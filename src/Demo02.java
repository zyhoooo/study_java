/**
 * @Description
 * @ClassName Demo02
 * @Author 钟宇豪
 * @Date 2022/5/3 14:12
 * @Version 1.0
 */
public class Demo02 {
    public static void main(String[] args) {
        String s = "cbba";
        System.out.println(longest(s));
    }
    public static String longest (String s) {
        int begin = 0, end = 0;
        boolean isMatch = true;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                isMatch = true;
                int temp = j;
                for (int k = i; k < j; k++) {
                    if (s.charAt(k) != s.charAt(temp)) {
                        isMatch = false;
                        break;
                    }
                    temp--;
                    if (k == temp)
                        break;
                }
                if (isMatch && j - i > end - begin) {
                    end = j;
                    begin = i;
                }
            }
        }
        String result = s.substring(begin, end + 1);
        return result;
    }
}
