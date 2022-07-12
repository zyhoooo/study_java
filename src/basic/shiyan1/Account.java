package basic.shiyan1;

/**
 * @Description TODO
 * @ClassName Account
 * @Author 钟宇豪
 * @Date 2022/2/7 16:34
 * @Version 1.0
 */
public class Account {

    private int id; //账号
    private double balance; //余额
    private double annualInterestRate; //年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount) {
        /**
         * 取钱
         */
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("成功取款" + amount + "元，当前余额" + this.balance + "元");
        } else {
            System.out.println("余额不足，取款失败");
        }
    }

    public void deposit(double amount) {
        /**
         * 存钱
         */
        this.balance += amount;
        System.out.println("成功存入"+amount+"元，当前余额"+this.balance+"元");
    }


}
