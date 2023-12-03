package OOPS;
// to access parent class properties,funactions and constructor
public class Supeer {
    public static void main(String[] args) {
        Fmale f =new Fmale();
        System.out.println(f.color);
    }
}
class Human{
    String color;
    Human(){
        System.out.println("Human constructor is called...");
    }
}
class Fmale extends Human{

    Fmale(){
        super.color="Green";
        System.out.println("Fmale constructor is called...");
    }
}
