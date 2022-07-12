package basic.duotai;

/**
 * @Description TODO
 * @ClassName OrderTest
 * @Author 钟宇豪
 * @Date 2022/2/13 16:04
 * @Version 1.0
 */
public class OrderTest {
}

class Order {
    int orderId;
    String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Order) {
            Order od = (Order) o;
            return this.orderId == od.orderId && this.orderName.equals(od.orderName);
        }
        return false;
    }
    
}
