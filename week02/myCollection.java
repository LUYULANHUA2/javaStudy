package week02;

import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class myCollection {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("aaa");
        c.add("bbb");
        c.add("cccc");
        c.add("aaa");

        c.remove("aaa");
        // c.remove("aaa");

        System.out.println(c);

        System.out.println("--------------------------------------------");
        //迭代器遍历collection
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        
        Iterator<String> it = coll.iterator();
        
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        
        System.out.println("---------------------------------");
        
        for(String s : coll){
            System.out.println(s);
        }
        
        System.out.println("---------------------------------");
        //匿名内部类
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s){
                System.out.println(s);
            } 
        });

        //lambda表达式
        coll.forEach((s)->System.out.println(s));
    }
    
}
