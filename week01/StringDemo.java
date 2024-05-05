package week01;

import java.util.StringJoiner;

public class StringDemo {

    public static void main(String[] args) {
        //StringJoiner的基本使用：
        StringJoiner sj = new StringJoiner("--", "[", "]");
        sj.add("abd");
        sj.add("555");
        int len = sj.length();

        String str = sj.toString();
        System.out.println(str);
        System.out.println(len);
        System.out.println(sj);

        char ch = str.charAt(2);
        System.out.println(ch);

        // stringbuilder:
        /*stringBuilder转换成String的过程 */
        StringBuilder sb = new StringBuilder();
        sb.append("str");
        sb.append(true);
        sb.append(5555);
        System.out.println(sb);
        String str2 = sb.toString();
        System.out.println(str2);

        //访问String中具体位置的方法
        char c = str2.charAt(3);
        System.out.println(c);

        //两个在串池中公用一个"abc"
        String s1 = "abc";
        String s2 = "a" + "b" + "c";
        System.out.println(s1 == s2);

        //StringBUilder的底层实现，当超过基础的容量，
        //进行扩容*2+2，超过扩容容量的时候，以实际的长度为容量
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        sb1.append("abcdefgabcdefgabcdefgabcdefgabcdefg");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());


    }
}
