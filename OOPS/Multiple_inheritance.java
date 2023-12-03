package OOPS;

public class Multiple_inheritance {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.food();
        b.efood();
    }


}
interface Harnivore{
    void food();
}
interface Carnivore{
    void efood();
}

class Bear implements Harnivore,Carnivore{
    @Override
    public void food() {
        System.out.println("eat grass");

    }

    @Override
    public void efood() {
        System.out.println("eat Meat");
    }
}




