package OOPS;

public class Types_of_Constrtuct {
    public static void main(String[] args) {
        Pencils ob=new Pencils();
        ob.tip=5;
        System.out.println(ob.tip);
        Pencils ob1=new Pencils(3);
//        System.out.println(ob1.tip);
        Pencils ob2=new Pencils("Green");
//        Pencils ob3=new Pencils("Green",3);//this two parameter contructor are not present in Pencils class
    }
}
class Pencils{
    {
        System.out.println("Hello guys");
    }
    String color;
    int tip;
    Pencils(String color){
        this.color=color;


    }
    Pencils(int tip){

        this.tip=tip;
    }
    Pencils(){
        System.out.println("Contructor is being called....");
    }
}


