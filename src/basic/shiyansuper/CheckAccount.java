package basic.shiyansuper;

/**
 * @Description TODO
 * @ClassName CheckAccount
 * @Author 钟宇豪
 * @Date 2022/2/10 20:44
 * @Version 1.0
 */
public class CheckAccount extends Account {
    private double overdraft; //可透支限额


    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= super.getBalance()) {
            super.setBalance(super.getBalance() - amount);
            System.out.println("成功取出" + amount + "元，当前余额为" + this.getBalance()+ "元");
        } else {
            if (this.overdraft>=amount-super.getBalance()){
                this.overdraft-=(amount-super.getBalance());
                super.setBalance(0);
                System.out.println("成功取出" + amount + "元，当前余额为" + this.getBalance()+ "元");
                System.out.println("剩余可透支额度为"+this.overdraft);
            }else{
                System.out.println("超过可透支的限额");
            }
        }
    }
}
