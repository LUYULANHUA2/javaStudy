package test;

import java.net.MalformedURLException;
import java.net.URL;

public class test01 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://www.baidu.com");
        System.out.println(url);

        Student01 student01 = new Student01();
        student01.test();

        Byte a = 127;
        System.out.println(++a);

        float[] f[] = new float[6][6];
        System.out.println(f);

        Thread t = new Thread() {
            // @Override
            public void run() {
                dianping();

            }
        };
        t.start();
        System.out.println(t.getName());
        System.out.print("dazhong");

    }

    static void dianping() {
        System.out.print("dianping");
    }

}
