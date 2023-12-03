package BiwiseManupulation;

public class AddonetoIntger {
    public static void main(String[] args) {
        int y=6;
        System.out.println("the negation of "+y+" is "+~y);
        System.out.println();
        System.out.println("and if we remove -ve sign we get x=x+1");
        System.out.println();
        int x=4;
        System.out.println(x+" + "+1+" is "+ (- ~x));
        x=-4;
        System.out.println(x+" + "+1+" is "+ (- ~x));
        x=0;
        System.out.println(x+" + "+1+" is "+(- ~x));

    }
}