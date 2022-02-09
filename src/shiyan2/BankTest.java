package shiyan2;

/**
 * @Description TODO
 * @ClassName BankTest
 * @Author 钟宇豪
 * @Date 2022/2/8 11:01
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Strange", "Stephen");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(3000);
        bank.getCustomer(0).getAccount().withdraw(300);
    }
}
