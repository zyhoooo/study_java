package basic.projectdemo2;

import static basic.projectdemo2.CMUtility.readConfirmSelection;
import static basic.projectdemo2.CMUtility.readMenuSelection;

/**
 * @Description TODO
 * @ClassName CustomerView
 * @Author 钟宇豪
 * @Date 2022/2/8 11:32
 * @Version 1.0
 */
public class CustomerView {
    public static void main(String[] args) {
        CustomerList customerList = new CustomerList();
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("--------------客户信息管理软件--------------");
            System.out.println();
            System.out.println("1 添加客户");
            System.out.println("2 修改客户");
            System.out.println("3 删除客户");
            System.out.println("4 客户列表");
            System.out.println("5 退    出");
            System.out.println();
            System.out.println("请选择(1-5):");
            switch (readMenuSelection()) {
                case '1':
                    customerList.addCustomer();
                    break;
                case '2':
                    customerList.updateCustomer();
                    break;
                case '3':
                    customerList.deleteCustomer();
                    break;
                case '4':
                    customerList.showList();
                    break;
                case '5':
                    System.out.println("确认退出(Y/N):");
                    if (readConfirmSelection() == 'Y')
                        isFlag = false;
                    break;
            }
        }
    }
}
