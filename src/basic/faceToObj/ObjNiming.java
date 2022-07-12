package basic.faceToObj;

/**
 * @Description TODO
 * @ClassName ObjNiming
 * @Author 钟宇豪
 * @Date 2022/1/28 14:43
 * @Version 1.0
 */
/*
匿名对象调用
 */
public class ObjNiming {
    public static void main(String[] args) {
        //匿名对象
        new Phone().sendEmail();

        //匿名对象的使用
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone());
    }
}

class PhoneMall {
    public void show(Phone phone) {
        phone.sendEmail();
    }
}

class Phone {
    double price;

    public void sendEmail() {
        System.out.println("发邮件");
    }

}
