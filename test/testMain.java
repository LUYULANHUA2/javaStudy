package test;

public class testMain {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Student01.test);
        Student01.test = "test10";
        test02();
        System.out.println(Student01.test);
        test03();
        System.out.println(Student01.test);

        String str = "123456";
        String str1 = new String("123456");
        // 比较引用
        System.out.println(str == str1); // 输出 false，引用不同
        System.out.println(str.equals(str1)); // 输出 true，内容相同
        
        System.out.println("String content:");
        System.out.println(str);
        System.out.println(str1);

        System.out.println("String hash codes:");
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());

        System.out.println("String identity hash codes:");
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str1));

        // 使用 Integer.parseInt() 方法
        int num1 = Integer.parseInt(str);
        System.out.println("Using Integer.parseInt(): " + num1);

        // 使用 Integer.valueOf() 方法
        Integer num2 = Integer.valueOf(str);
        System.out.println("Using Integer.valueOf(): " + num2);

    }

    public static void test02() {
        Student01.test = "test02";
    }

    public static void test03() {
        Student01.test = "test03";
    }
}
