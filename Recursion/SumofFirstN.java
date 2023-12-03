package Recursion;

import java.util.Scanner;

public class SumofFirstN {
    public static int sumofn(int n){
        if(n==1){
            return 1;
        }
        int snm1=sumofn(n-1);
        int sum=n+snm1;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n= sc.nextInt();
        System.out.println("Sum of First N Natural number is (by recursion)\n"+sumofn(n));
    }
}
