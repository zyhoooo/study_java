/**
 * @Description TODO
 * @ClassName VariableTest2
 * @Author 钟宇豪
 * @Date 2021/11/28 10:28
 * @Version 1.0
 */
/*
变量类型自动转换
double > float > long > int > char 、 short 、 byte

强制类型转换
需要使用强转符，会导致精度损失
 */
public class VariableTest2 {
    public static void main(String[] args) {
        double d1 = 12.23;
        int i1 = (int)d1;
        System.out.println(i1);
    }
}
