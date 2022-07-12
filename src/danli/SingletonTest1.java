package danli;

/**
 * @Description 单例设计模式
 * @ClassName SingletonTest1
 * @Author 钟宇豪
 * @Date 2022/4/1 9:21
 * @Version 1.0
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        Order order = Order.getInstance();
    }
}

//饿汉式
class Bank{

    //1.私有化类的构造器
    private Bank(){

    }

    //2.内部创建类的静态对象
    private static Bank instance = new Bank();

    //3.提供公共的静态方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }

}

//懒汉式:目前写法存在线程不安全
class Order{

    //1.私有化构造器
    private Order(){

    }

    //2.声明当前类对象，不初始化
    private static Order instance = null;

    //3.声明public方法
    public static Order getInstance(){
        if (instance == null)
        instance = new Order();
        return instance;
    }
}