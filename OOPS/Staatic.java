package OOPS;

public class Staatic {
    public static void main(String[] args) {
        AStudent a = new AStudent();
        a.schoolname="Bharat Vidyalaya";
        System.out.println(a.schoolname);
        AStudent b =new AStudent();

        System.out.println(b.schoolname);
    }
}
class AStudent{
    String name ;
    int age;
    static String schoolname;
}
