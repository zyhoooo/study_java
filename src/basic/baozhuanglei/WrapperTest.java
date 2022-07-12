package basic.baozhuanglei;

import org.junit.jupiter.api.Test;

/**
 * @Description Java包装类的使用
 * 掌握 基本数据类型、包装类、String之间的相互转换
 * @ClassName WrapperTest
 * @Author 钟宇豪
 * @Date 2022/3/7 21:58
 * @Version 1.0
 */
public class WrapperTest {

    //练习3
    @Test
    public void test8(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); //false

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n); //true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); //false
        // integer有从-128~127的数组元素可以直接使用，可以加快运行速度
        // 不用再去new，超过就需要new
    }

    //练习2
    @Test
    public void test7() {
        Object o2;
        if (true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);
    }

    //练习1
    @Test
    public void test6() {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1); //1.0
    }

    //String转基本数据类型、包装类
    @Test
    public void test5() {
        //调用包装类的parseXxx()
        String str1 = "123";
        int i1 = Integer.parseInt(str1);
        System.out.println(i1);
    }

    //基本数据类型、包装类转String
    @Test
    public void test4() {
        //连接运算
        int i1 = 10;
        String str1 = i1 + "";
        //valueOf()
        String str2 = String.valueOf(i1);
        System.out.println(str1);
        System.out.println(str2);
    }

    // JDK5.0特性：自动装箱和自动拆箱
    @Test
    public void test3() {
        int i1 = 10;
        Integer integer = i1; //自动装箱

        Integer integer1 = 10;
        int i2 = integer; //自动拆箱
    }

    // 包装类转基本数据类型 ---> xxxValue()
    @Test
    public void test2() {
        Integer integer = 12;
        int i1 = integer.intValue();
        System.out.println(i1);
    }

    // 基本数据类型转包装类
    @Test
    public void test1() {
        Integer integer = 10;
        System.out.println(integer);

        Integer integer1 = Integer.valueOf("123");
        System.out.println(integer1);
    }

}
