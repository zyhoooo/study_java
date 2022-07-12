package senior;

import static java.lang.Thread.sleep;

/**
 * start():启动当前线程，调用当前线程的run()方法
 * run():通常需要重写，将创建的线程要执行的操作声明在此方法中
 * currentThread():静态方法，返回执行当前代码的线程
 * getName():获取当前线程的名字
 * setName():设置当前线程的名字
 * yield():释放当前线程的执行权
 * join():进入阻塞状态，直到另一个线程执行完毕
 * sleep():强制睡眠
 *
 *
 * 线程的优先级：
 *  MAX_PRIORITY : 10
 *  MIN_PRIORITY : 1
 *  NORM_PRIORITY : 5 --> 默认
 *  设置线程优先级：setPriority(int p)
 *              getPriority()
 *
 * @Description TODO 多线程的创建
 * @ClassName ThreadTest
 * @Author 钟宇豪
 * @Date 2022/7/12 11:56
 * @Version 1.0
 */

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + ":" + i);

        }
    }
}

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread1 = new MyThread();
        myThread1.start();

    }

}
