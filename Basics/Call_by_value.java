package Basics;

public class Call_by_value {
    public static void main(String[] args) {
        int a=10;
        System.out.println(d(a)) ;
        System.out.println(a);
    }
    public static int d(int a){
        return a=2*a;
    }
}
