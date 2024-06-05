package week03_thread;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {

    static int ticket;
    static Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (ticket < 100) {

                    ticket++;
                    System.out.println(getName() + "购买了第" + ticket + "张票");
                } else {
                    break;
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static ReentrantLock lock = new ReentrantLock();

    // @Override
    // public void run() {
    //     while (true) {
    //         lock.lock();
    //         if (ticket < 100) {
    //             ticket++;
    //             System.out.println(getName() + "购买了第" + ticket + "张票");
    //         } else {
    //             lock.unlock();
    //             break;
    //         }
    //         lock.unlock();
    //         try {
    //             Thread.sleep(10);
    //         } catch (InterruptedException e) {
    //             throw new RuntimeException(e);
    //         } finally {

    //         }
    //     }
    // }
}
