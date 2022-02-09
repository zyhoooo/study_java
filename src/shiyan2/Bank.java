package shiyan2;

/**
 * @Description TODO
 * @ClassName Bank
 * @Author 钟宇豪
 * @Date 2022/2/8 10:52
 * @Version 1.0
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        this.numberOfCustomer = 0;
        this.customers = new Customer[10];
    }

    public void addCustomer(String f, String l) {
        this.customers[numberOfCustomer] = new Customer(f, l);
        numberOfCustomer++;
        System.out.println("成功添加用户" + f + " " + l);
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }

}
