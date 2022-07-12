package basic.staticexer;

/**
 * @Description TODO
 * @ClassName BankTest
 * @Author 钟宇豪
 * @Date 2022/3/30 9:31
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {

        Bank bk1 = new Bank();
        Bank bk2 = new Bank("123456",20000);

        System.out.println(bk1);
        System.out.println(bk2);


    }
}
class Bank{
    private int id;
    private String password = "000000";
    private double balance;

    private static double rate;
    private static double minMoney = 1.0;
    private static int init = 1001;

    public Bank(){
        id = init++;
    }

    public Bank(String password, double balance){
        id = init++;
        this.password = password;
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Bank.rate = rate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Bank.minMoney = minMoney;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
