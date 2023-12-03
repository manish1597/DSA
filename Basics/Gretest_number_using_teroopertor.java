package Basics;
public class Gretest_number_using_teroopertor {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int result ;
        result= ((a>b)?(a>c)? a:c:(b>c)? b:c);
        System.out.println("Gretest number is :"+result);
    }
}
