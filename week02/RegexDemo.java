package week02;
//正则表达式练习
public class RegexDemo {
    public static void main(String[] args) {

        String qq = "1561659632";
        System.out.println(qq.matches("[1-9]\\d{5,19}"));

        System.out.println("ab".matches("[abc][abc]"));
    }
    
}
