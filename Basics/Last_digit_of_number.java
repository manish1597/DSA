package Basics;


import java.util.Scanner;

public class Last_digit_of_number {
    public static void utility(int n){
        int x= Math.abs(n);
        int ans = x%10;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number any number :");
        int n = sc.nextInt();
        System.out.println("Last digit is ");
        utility(n);

    }
}
