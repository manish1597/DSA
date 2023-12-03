package OOPS;

public class Construteer_Chaining {
    public static void main(String[] args) {


        B b = new B();
    }
}
class A{
    A(){
        System.out.println("A 1");
    }
}
class B extends A {
    B(){
        this(5);//B(int num) is being called//by default it is super
        System.out.println("B 1");
    }
    B(int num){
        super();//by default it is super you don't need to write // Automatically here compiler write super hence output will be
        //A 1
        //B 2 parameterized constructor
        //B 1
        System.out.println("B 2 parameterized constructor");
    }
}