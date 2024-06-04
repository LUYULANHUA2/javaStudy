package Thread;

public class MyThread extends Thread {

    static int ticket;
    static Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "购买了第" + ticket + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
