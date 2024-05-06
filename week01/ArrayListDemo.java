package week01;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //不能直接存储基础数据类型
        ArrayList<String> list =new ArrayList<>();
        System.out.println(list);
        list.add("abcd");
        list.add("null");
        list.add("12232");
        list.add("55555");
        System.out.println(list);
        list.remove("null");
        list.remove(2);
        list.set(1,"nulllllllll");
        System.out.println(list.get(1));
        System.out.println(list);
    }
}
