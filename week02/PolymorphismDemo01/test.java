package week02.PolymorphismDemo01;


public class test {
    public static void main(String[] args) {
        Animal a = new Dog();

        // 调用成员变量，编译看左边，调用也看左边
        System.out.println(a.name);
        // 调用成员函数，编译看左边，调用看右边
        a.show();

        // 将a从animal类型转换成dog类型，实现一些dog类的方法

        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.LookHome();
        } else if (a instanceof Cat c) {
            c.eatFish();
        } else {
            System.out.println("error");
        }

    }

}

class Animal {
    public String name = "animal";

    public void show() {
        System.out.println("animal show");
    }
}

class Dog extends Animal {
    public String name = "dog";

    @Override
    public void show() {
        System.out.println("dog show");
    }

    public void LookHome() {
        System.out.println("dog look Home");
    }
}

class Cat extends Animal {
    public String name = "Cat";

    @Override
    public void show() {
        System.out.println("Cat show");
    }

    public void eatFish() {
        System.out.println("cat eat fish");
    }
}