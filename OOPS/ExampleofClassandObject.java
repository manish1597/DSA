package OOPS;

public class ExampleofClassandObject {


    public static void main(String[] args) {
        int count =23;
        Pen p1=new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
//        System.out.println(count);
    }

}
class Pen{
    String color;
    int tip;
    void setColor(String newcolor){
        color =newcolor;
    }
    void setTip(int newtip){
        tip=newtip;
    }
}
