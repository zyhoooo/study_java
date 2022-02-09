package projectdemo2;

/**
 * @Description TODO
 * @ClassName Customer
 * @Author 钟宇豪
 * @Date 2022/2/8 17:00
 * @Version 1.0
 */
public class Customer {
    private String name;
    private char sex;
    private int age;
    private String mobilePhoneNumber;
    private String mail;

    public Customer(String name, char sex, int age, String mobilePhoneNumber, String mail) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
