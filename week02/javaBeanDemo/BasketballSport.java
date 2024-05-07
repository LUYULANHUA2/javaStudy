package week02.javaBeanDemo;

public class BasketballSport extends Sportsman implements English{


    public BasketballSport(){

    }
    public BasketballSport(String name ,int age){
        super(name, age);
    }
    @Override
    public void speak() {
      System.out.println("学习说英语");
    }

    @Override
    public void study() {
        System.out.println("学习打篮球");
    }
    
}
