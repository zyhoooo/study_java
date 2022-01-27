package yunsuanfu;

import javax.swing.text.StyledEditorKit;

/**
 * @Description TODO
 * @ClassName yunsuanfu4
 * @Author 钟宇豪
 * @Date 2022/1/20 14:10
 * @Version 1.0
 */
/*
逻辑运算符：& && | || ! ^(异或)
操作的都是布尔类型的变量，
 */
public class yunsuanfu4 {
    public static void main(String[] args) {
        // 区分 & 和 &&
        boolean x = false;
        boolean y = false;
        short z = 42;
        if ((z++ == 42) && (y = true)) z++;
        if ((x = false) || (++z == 45)) z++;

        System.out.println(z);
    }
}
