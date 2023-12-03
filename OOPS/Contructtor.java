package OOPS;

public class Contructtor {
    public static void main(String[] args) {
        Pencil obj =new Pencil("Red",4);
        System.out.println(obj.color);
    }

}
class Pencil{
    String color;
    int tip;
    Pencil(String color,int tip){
        this.color=color;
        this.tip=tip;
//        System.out.println(this.color);//Another method

    }
}
