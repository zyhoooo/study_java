/**
 * @Description TODO
 * @ClassName VariableTest
 * @Author 钟宇豪
 * @Date 2021/11/27 21:00
 * @Version 1.0
 */
/*
变量地使用：
1、java定义变量的格式： 数据类型 变量名 = 变量值;
2、变量必须先定义后使用；在作用域内是有效的，出了作用域就失效
3、同一个作用域内不能声明两个同名的变量
 */
public class VariableTest {

    public static void main(String[] args) {

        //变量的定义
        int myAge = 12;
        //变量的使用
        System.out.println(myAge);

        //变量的声明
        int myNumber;
        //变量的赋值
        myNumber = 111;
        //变量的使用
        System.out.println(myNumber);
    }

}
