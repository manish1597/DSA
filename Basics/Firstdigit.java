package Basics;



import java.util.Scanner;

public class Firstdigit {
    public static void first(int n){
        int m=n;
        while(n>10){
            n=n/10;
        }
        System.out.println("First digit of "+m+"="+n);
    }
    public static int firstDigit(int n){
        double pow =Math.log10(n);
        int p = (int) pow;
        int pwr =(int)Math.pow(10,p);
        System.out.println("Last digit is ");
        return n/pwr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        // first(n);
        System.out.println(firstDigit(n));
    }
}
