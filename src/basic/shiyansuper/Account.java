package basic.shiyansuper;

/**
 * @Description TODO
 * @ClassName Account
 * @Author 钟宇豪
 * @Date 2022/2/10 20:32
 * @Version 1.0
 */
public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
    }

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

    public double getMonthlyInterest() {
        return this.annualInterestRate / 12;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("成功取出" + amount + "元，当前余额为" + this.balance + "元");
        } else {
            System.out.println("余额不足！");
            System.out.println("您的账户余额为：" + this.balance);
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("成功存入" + amount + "元，当前余额为" + this.balance + "元");
    }
}
