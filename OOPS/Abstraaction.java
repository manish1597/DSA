package OOPS;




public class Abstraaction {
    public static void main(String[] args) {
        Dear s1 = new Dear();
        s1.eat();
        s1.walk();
        System.out.println(s1.colour);



    }

}
abstract class Animaals{
    String colour;
    Animaals(){
        System.out.println("Animal constructor is being called...");
    }
    Animaals( String colour){
        this.colour =colour;
    }
    void eat() {
        System.out.println("Animals eats");
    }
    abstract void walk();// now this method is compulsory to define in child class


}
class Dear extends Animaals{
    Dear(){// to understand constructor hierarchie first animal constructor called and then Dear constructor called
        System.out.println("Dear constructor is being called...");
    }
    void  walk(){
        System.out.println("Dear has 4 legs");
    }
}
class cat extends Animaals{
    void walk(){
        System.out.println("cat sometime walks on 2 legs");
    }

}
