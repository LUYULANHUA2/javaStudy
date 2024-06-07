package GetClass;

import java.lang.reflect.Constructor;

public class MyReflectDemo {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("GetClass.Student");

        Constructor[] cons1 = clazz.getConstructors();

        //获取构造参数
        for (Constructor con : cons1) {
            System.out.println(con);
        }

        Constructor[] cons2 = clazz.getDeclaredConstructors();

        for (Constructor con : cons2) {
            System.out.println(con);
        }
    }
}
