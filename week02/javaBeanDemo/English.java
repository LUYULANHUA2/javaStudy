package week02.javaBeanDemo;

public interface English {
    public void speak();

    public static void show() {
        System.out.println("show~~~");
        show2();
    }

    public default void method() {
        System.out.println("默认的方法");
        show1();
    }

    private void show1(){
        System.out.println("show1()~~~");
    }

    private static void show2(){
        System.out.println("show2()~~~");
    }
}
