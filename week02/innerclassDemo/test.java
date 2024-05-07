package week02.innerclassDemo;

public class test {
    public static void main(String[] args) {
        new Swim() {
        @Override
        public void swimming() {
        System.out.println("swimming~~~");
        }
        };

        // animal a = new animal() {
        // // @Override
        // public void eat() {
        // System.out.println("eatting~~~");
        // }
        // };

        method(new animal() {
            @Override
            public void eat() {
                System.out.println("eatting~~~");
            }
        });
    }

    public static void method(animal a) {
        a.eat();
    }
}
