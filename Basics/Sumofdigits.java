package Basics;

import java.util.Scanner;

public class Sumofdigits {
    public static void sumDigit(int n){
        int m=n;
        int sum=0;
        while(n>0){
            int last=n%10;
            sum= sum+last;
            n=n/10;
        }
        System.out.println("Internal sum of "+m+" ="+sum);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sumDigit(n);
    }
}
