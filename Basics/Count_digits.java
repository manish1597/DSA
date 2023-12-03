package Basics;


import java.util.Scanner;

public class Count_digits {

    public static void countDigits(int n){
        int i=0;
        while(n>0){
            n=n/10;
            i++;
        }

        System.out.print(i);
        ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number any number :");
        int n = sc.nextInt();
        System.out.println("No. of digits are ");
        countDigits(n);

    }
}
