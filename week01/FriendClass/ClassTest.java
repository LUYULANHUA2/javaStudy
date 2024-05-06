package week01.FriendClass;

public class ClassTest {
    public static void main(String[] args) {
        GirlFriend g = new GirlFriend();
        g.setAge(203);
        g.setName("gauss");
        System.out.println(g.getName());
        System.out.println(g.getAge());
        System.out.println(GirlFriend.teacherName);

        //子类无法继承父类的构造器
        //子类可以继承父类的public and private 成员变量
        //子类可以继承父类的public 成员函数


        GirlFriend lin = new GirlFriend("lin","20211001",18);
        System.out.println(lin.getName());
        System.out.println(lin.getId());
        System.out.println(lin.getAge());
    }
}
