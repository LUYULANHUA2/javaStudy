package week01.FriendClass;

public class Friend {
    public String name = "Fu";
    private int age;
    private String id;

    public Friend() {

    }

    public Friend(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void work(){
        System.out.println("friend work");
    }

}
