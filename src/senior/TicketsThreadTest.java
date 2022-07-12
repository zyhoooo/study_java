package senior;

/**
 * @Description TODO 创建三个窗口卖票，总票数为100张
 * @ClassName TicketsThreadTest
 * @Author 钟宇豪
 * @Date 2022/7/12 13:48
 * @Version 1.0
 */
public class TicketsThreadTest {

}

class window extends Thread {
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized(obj) {
                if (ticket > 0) {
                    System.out.println();
                }
            }
        }
    }

}
