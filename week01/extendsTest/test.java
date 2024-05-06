package week01.extendsTest;

public class test {
    public static void main(String[] args) {
        cat lihuamao = new cat();
        lihuamao.setName("狸花猫");
        lihuamao.setAge(3);
        System.out.println(lihuamao.getName());
        lihuamao.drink();
        lihuamao.eat();
        lihuamao.CatchMouse();

        taidi t = new taidi();
        t.setName("泰迪");
        System.out.println(t.getName());
        t.drink();
        t.eat();
        t.WatchHome();
        t.action();
    }
}
