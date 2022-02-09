package shiyan1;

/**
 * @Description TODO
 * @ClassName BankTest
 * @Author 钟宇豪
 * @Date 2022/2/7 16:45
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Account account = new Account(1000, 2000.0, 0.0123);
        Customer customer=new Customer("Lane", "Smith");
        customer.setAccount(account);
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
    }
}
