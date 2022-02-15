package shiyansuper;

/**
 * @Description TODO
 * @ClassName AccountTest
 * @Author 钟宇豪
 * @Date 2022/2/10 20:40
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
//        Account account = new Account(1122, 20000, 0.045);
//        account.withdraw(30000);
//        account.withdraw(2500);
//        account.deposit(3000);
//        System.out.println("月利率为：" + account.getMonthlyInterest());
        CheckAccount checkAccount=new CheckAccount(1122,20000,0.045,5000);
        checkAccount.withdraw(5000);
        checkAccount.withdraw(18000);
        checkAccount.withdraw(3000);
    }
}
