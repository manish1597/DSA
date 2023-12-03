package OOPS;

public class Getter_Setter {
    public static void main(String[] args) {


        Pens p2 = new Pens();
//    p1.color="blue"// color is private can not use like that use getters and setters
        p2.setTip(6);
//        System.out.println(p2.tip);// tip has private modiers
        System.out.println(p2.getTip());
    }




}
class Pens{
    private String color;
    private int tip;

    int getTip() {
        return this.tip;

    }

    String getColor() {
        return this.color;
    }

    void setColor(String newcolor){
        this.color =newcolor;
    }
    void setTip(int newtip){
        this.tip=newtip;
    }
}