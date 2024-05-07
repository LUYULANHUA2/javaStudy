package week02.javaBeanDemo;

public class test {
    public static void main(String[] args) {
        Person p = new BasketballSport();
        Sportsman s = new BasketballSport();
        s.study();

        BasketballSport b = new BasketballSport();
        b.speak();
        b.method();

        English.show();
    }
    
}
