package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.swim();//overridng

        Fish obj = new Fish();
//        obj.swim();
        obj.color();
        obj.swim();//Overriding
        Shark ob1= new Shark();
        ob1.eat();
        ob1.life="21 year";
        System.out.println(ob1.life);
        egle e1 =new egle();
        e1.eat();
    }

}
class   Animal{
    void color(){
        System.out.println("green");
    }
    void eat(){
        System.out.println("Vegan");
    }
    void swim(){
        System.out.println("I think no");

    }


}
//SINFGLE INHERITANCE
class Fish extends Animal{
    String life;
    void swim(){
        System.out.println("yes it is swim in water");

    }


}
//MULTI LEVEL INHERITANCE
class Shark extends Fish{
    int teeth;
}
//HIERACHICAL INHERITANCE
class Dog extends Animal{
    String bark;

}
class egle extends Animal{
    String fly;
}
