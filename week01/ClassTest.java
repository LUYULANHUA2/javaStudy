package week01;

public class ClassTest {
    public static void main(String[] args) {
        GirlFriend g = new GirlFriend();
        g.setAge(203);
        g.setName("gauss");
        System.out.println(g.getName());
        System.out.println(g.getAge());
        System.out.println(GirlFriend.teacherName);

        String s1 = "abc";
        String s2 = "abc";
        // System.out.println(s1);
        // System.out.println(s2);

        int hashCode = System.identityHashCode(s1);
        System.out.println("s1对象的引用：" + hashCode);
        hashCode = System.identityHashCode(s2);
        System.out.println("s2对象的引用：" + hashCode);
        s2+='c';
        hashCode = System.identityHashCode(s2);
        System.out.println("s2对象的引用：" + hashCode);
    }
}
