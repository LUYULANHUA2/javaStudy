package week03_thread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("t1");
        MyThread t2 = new MyThread();
        t2.setName("t2");
        MyThread t3 = new MyThread();
        t3.setName("t3");

        t2.start();
        t3.start();
        t1.start();

        Foodie foodie = new Foodie();
        foodie.setName("foodie");
        Cook cook = new Cook();
        cook.setName("cook");
        foodie.start();
        cook.start();

    }
}
