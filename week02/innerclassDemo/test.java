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

        //匿名内部类的lambds简化
        method02(()->{
            System.out.println("swimming");
        });
    }

    public static void method(animal a) {
        a.eat();
    }

    public static void method02(Swim s){
        s.swimming();
    }
}
