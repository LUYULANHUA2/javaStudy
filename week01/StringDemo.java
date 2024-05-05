package week01;

import java.util.StringJoiner;

public class StringDemo {

    public static void main(String[] args) {
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
        StringBuilder sb = new StringBuilder();
        sb.append("str");
        sb.append(true);
        sb.append(5555);
        System.out.println(sb);
        String str2 = sb.toString();
        System.out.println(str2);
        char c = str2.charAt(3);
        System.out.println(c);

        String s1 = "abc";
        String s2 = "a" + "b" + "c";
        System.out.println("s1 = s2 ?"+s1 == s2);

    }
}
