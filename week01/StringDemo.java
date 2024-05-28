package week01;

import java.util.Random;
import java.util.StringJoiner;

public class StringDemo {

    public static void main(String[] args) {
        // StringJoiner的基本使用：
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
        /* stringBuilder转换成String的过程 */
        StringBuilder sb = new StringBuilder();
        sb.append("str");
        sb.append(true);
        sb.append(5555);
        System.out.println(sb);
        String str2 = sb.toString();
        System.out.println(str2);

        // 访问String中具体位置的方法
        char c = str2.charAt(3);
        System.out.println(c);

        // 两个在串池中公用一个"abc"
        String str1 = "abc";
        String str3 = "a" + "b" + "c";
        System.out.println(str1 == str3);

        String s1 = "abc";
        String s2 = "abc";
        // System.out.println(s1);
        // System.out.println(s2);

        int hashCode = System.identityHashCode(s1);
        System.out.println("s1对象的引用：" + hashCode);
        hashCode = System.identityHashCode(s2);
        System.out.println("s2对象的引用：" + hashCode);
        s2 += 'c';
        hashCode = System.identityHashCode(s2);
        System.out.println("s2对象的引用：" + hashCode);

        // StringBUilder的底层实现，当超过基础的容量，
        // 进行扩容*2+2，超过扩容容量的时候，以实际的长度为容量
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity());// 16
        System.out.println(sb1.length());// 0

        sb1.append("abcdefg");
        System.out.println(sb1.capacity());// 16
        System.out.println(sb1.length());// 7

        sb1.append("abcdefgabcdefgabcdefgabcdefg");
        System.out.println(sb1.capacity());// 35
        System.out.println(sb1.length());// 35

        sb1.append("abcdefg");
        System.out.println(sb1.capacity());// 72
        System.out.println(sb1.length());// 42

        // 打乱顺序后返回
        System.out.println(changeStr("abcdefghi"));

        System.out.println((int) '9');// 48~57
        System.out.println((char) 122);// 65~90 + 97~122
        System.out.println(yanzhengma(16));

    }

    public static String changeStr(String str) {
        char[] chars = str.toCharArray();
        Random r = new Random();
        for (int i = 0; i < chars.length; i++) {
            int index = r.nextInt(chars.length);
            char c = chars[i];
            chars[i] = chars[index];
            chars[index] = c;
        }
        return String.valueOf(chars);
    }

    public static String yanzhengma(int len) {
        Random r1 = new Random();
        int num = r1.nextInt(len);
        String str = "";
        for (int i = 0; i < len; i++) {
            Random r2 = new Random();
            if (i == num) {
                str += (char) r2.nextInt(48, 57);
            } else {
                int res = r2.nextInt(65, 122);
                while (90 < res && res < 97) {
                    res = r2.nextInt(65, 122);
                }
                str += (char) res;
            }
        }
        return str;
    }
}
