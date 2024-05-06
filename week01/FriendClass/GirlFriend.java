package week01.FriendClass;

/**
 * GirlFriend
 */
public class GirlFriend extends Friend{

    static final String teacherName = "khora";
    public GirlFriend(){

    }
    public GirlFriend(String name, String id, int age) {
        super(name, id, age); // 调用父类的有参构造器进行初始化
    }
}