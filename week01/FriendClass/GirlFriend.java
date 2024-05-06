package week01.FriendClass;

/**
 * GirlFriend
 */
public class GirlFriend extends Friend {

    public String name = "Zi";
    static final String teacherName = "khora";

    public GirlFriend() {

    }

    public GirlFriend(String name, String id, int age) {
        super(name, id, age); // 调用父类的有参构造器进行初始化
    }


    public void show() {
        System.out.println("name = " + name);
        System.out.println("this.name = " + this.name);
        System.out.println("super.name = " + super.name);

        super.work();
        this.work();
    }

    @Override
    public void work(){
        System.out.println("girlfriend work");
    }
}