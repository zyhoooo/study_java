package shiyan2;

/**
 * @Description TODO
 * @ClassName Account
 * @Author 钟宇豪
 * @Date 2022/2/8 10:44
 * @Version 1.0
 */
public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        //存款
        this.balance += amt;
        System.out.println("成功存入" + amt + "元");
    }

    public void withdraw(double amt) {
        //取款
        if (this.balance >= amt) {
            this.balance -= amt;
            System.out.println("取款" + amt + "元，当前余额" + this.balance + "元");
        } else {
            System.out.println("余额不足");
        }
    }
}
