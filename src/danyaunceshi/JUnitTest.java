package danyaunceshi;

import org.junit.jupiter.api.Test;

/**
 * @Description java单元测试
 * 格式：方法权限是public，没有返回值，没有形参
 * 方法上要声明 @test
 * @ClassName JUnitTest
 * @Author 钟宇豪
 * @Date 2022/3/5 16:08
 * @Version 1.0
 */
public class JUnitTest {

    @Test
    public void testEquals() {
        String s1 = "m";
        String s2 = "n";
        System.out.println(s1.equals(s2));
    }

}
