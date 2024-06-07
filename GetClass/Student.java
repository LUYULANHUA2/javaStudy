package GetClass;

public class Student {
    private String name;
    String age;
    String sex;

    public Student() {

    }

    public Student(String name, String age, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
