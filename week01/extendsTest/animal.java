package week01.extendsTest;

public class animal {
    private String name;
    private int age;
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

    public void eat(){
        System.out.println("吃饭~~~");
    }
    public void drink(){
        System.out.println("喝水~~~");
    }
    
}
