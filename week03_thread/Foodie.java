package week03_thread;

public class Foodie extends Thread{

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count <= 0)
                    break;
                else {
                    if (Desk.foodFlag == 0) {
                        try {
                            Desk.lock.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        Desk.count--;
                        System.out.println("吃货还能吃" + Desk.count + "碗面条");
                        Desk.lock.notifyAll();
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
