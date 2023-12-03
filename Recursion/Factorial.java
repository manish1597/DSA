package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1=factorial(n-1);
        int fact=n*fnm1;

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n= sc.nextInt();
        System.out.println("The Factorial of given number is \n"+ factorial(n));

    }
}
