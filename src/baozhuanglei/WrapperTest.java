package baozhuanglei;

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

    //基本数据类型、包装类转String
    @Test
    public void test4() {
        //方式1
        int i1 = 10;
        String str1 = i1 + "";
        //
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
