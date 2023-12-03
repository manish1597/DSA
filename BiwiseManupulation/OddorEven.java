package BiwiseManupulation;

import java.util.Scanner;

public class OddorEven {

    public static void Oddeven(int n){
        if((n&1)==0){
            System.out.println("The given number "+n+" is \n"+"Even");
        }
        else {
            System.out.println("The given number "+n+" is \n"+"Odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= sc.nextInt();
        Oddeven(n);
    }
}
