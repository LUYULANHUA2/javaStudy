package week01;

/**
 * GirlFriend
 */
public class GirlFriend {

    private int age;
    private String name;
    static final String teacherName = "khora";

    public int getAge() {
        int age = 10;
        System.out.println(age);
        System.out.println(this.age);
        return this.age;
    }

    public void setAge(int x) {
        this.age = x;
    }
    
    public String getName(){
        return this.name;
    }
}