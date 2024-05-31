package test;

public class testMain {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(student01.test);
        student01.test = "test10";
        test02();
        System.out.println(student01.test);
        test03();
        System.out.println(student01.test);


        String str = "123456";
        
        // 使用 Integer.parseInt() 方法
        int num1 = Integer.parseInt(str);
        System.out.println("Using Integer.parseInt(): " + num1);
        
        // 使用 Integer.valueOf() 方法
        Integer num2 = Integer.valueOf(str);
        System.out.println("Using Integer.valueOf(): " + num2);
    }
    
    public static void test02(){
        student01.test = "test02";
    }

    public static void test03(){
        student01.test = "test03";
    }
}
