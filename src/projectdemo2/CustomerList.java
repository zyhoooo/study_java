package projectdemo2;

import static projectdemo2.CMUtility.*;

/**
 * @Description TODO
 * @ClassName CustomerList
 * @Author 钟宇豪
 * @Date 2022/2/8 17:04
 * @Version 1.0
 */
public class CustomerList {

    /*public static void main(String[] args) {
        CustomerList customerList=new CustomerList();
        customerList.showList();
    }*/

     Customer[] customers = new Customer[20];
    private int customerAmount = 0;

    public void showList() {
        System.out.println("----------------客户列表----------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
        for(int i=0;i<customerAmount;i++){
            if(customers[i]!=null){
                System.out.println((i+1)+"\t"+customers[i].getName()+"\t"+customers[i].getSex()+"\t"+customers[i].getAge()
                +"\t"+customers[i].getMobilePhoneNumber()+"\t"+customers[i].getMail());
            }
        }
        System.out.println("---------------客户列表完成---------------");
    }

    public void addCustomer() {
        System.out.println("----------------添加客户----------------");
        System.out.print("姓名：");
        String name=readString(10);
        System.out.print("姓别：");
        char sex=readChar();
        System.out.print("年龄：");
        int age=readInt();
        System.out.print("电话：");
        String phone=readString(11);
        System.out.print("邮箱：");
        String mail=readString(20);
        customers[customerAmount]=new Customer(name,sex,age,phone,mail);
        customerAmount++;
        System.out.println("----------------添加完成----------------");

    }

    public void updateCustomer() {
        System.out.println("----------------修改客户----------------");
        System.out.print("请选择待修改客户的编号(-1退出)：");
        int index=readInt();
        System.out.print("姓名("+customers[index-1].getName()+")：");
        String name=readString(10,customers[index-1].getName());
        System.out.print("姓别("+customers[index-1].getSex()+")：");
        char sex=readChar(customers[index-1].getSex());
        System.out.print("年龄("+customers[index-1].getAge()+")：");
        int age=readInt(customers[index-1].getAge());
        System.out.print("电话("+customers[index-1].getMobilePhoneNumber()+")：");
        String phone=readString(11,customers[index-1].getMobilePhoneNumber());
        System.out.print("邮箱("+customers[index-1].getMail()+")：");
        String mail=readString(20,customers[index-1].getMail());
        customers[index-1]=new Customer(name,sex,age,phone,mail);
        System.out.println("----------------修改完成----------------");

    }

    public void deleteCustomer() {
        System.out.println("----------------删除客户----------------");
        System.out.print("请选择待删除客户编号(-1退出):");
        int index=readInt();
        if(index-1<customerAmount&&index-1>=0) {
            System.out.print("确认是否删除(Y/N):");
            if (readConfirmSelection() == 'Y') {
                for(int i=customerAmount-1;i>index-1;i--){
                    customers[i-1]=customers[i];
                    customers[i]=null;
                }
                System.out.println("----------------删除完成----------------");
            }
        }else if(index==-1) {
            System.out.println("即将返回主菜单...");
        }else{
            System.out.println("没有此用户！即将返回主菜单...");
        }
    }

}
