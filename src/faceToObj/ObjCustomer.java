package faceToObj;

/**
 * @Description TODO
 * @ClassName ObjCustomer
 * @Author 钟宇豪
 * @Date 2022/1/27 15:27
 * @Version 1.0
 */
/*
类应该具有的功能

权限修饰符：protected public private 缺省
 */
public class ObjCustomer {
}

class Customer {

    String name;
    int age;
    boolean isMale;

    public void eat(){
        System.out.println("客户吃饭");
    }

    public void sleep(int hour){
        System.out.println("客户休息了"+hour+"个小时");
    }

    public String getName(){
        return this.name;
    }


}
