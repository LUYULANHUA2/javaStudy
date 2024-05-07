package week02.javaBeanDemo;


public class Person {
    private String name;
    private int age;

    static{
        System.out.println("创建对象成功");
    }
    public Person(){}

    
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
