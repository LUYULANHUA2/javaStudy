package week03_thread;

public class Cook extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count <= 0)
                    break;
                else {
                    if (Desk.foodFlag == 1) {
                        try {
                            Desk.lock.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("厨师正在做第" + Desk.count + "碗面条");
                        Desk.lock.notifyAll();
                        Desk.foodFlag = 1;
                    }
                }
            }
        }
    }
}
