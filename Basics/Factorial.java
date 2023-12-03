package Basics;


import java.util.Scanner;

public class Factorial {
    public static int nFactorial(int n) {
        int ans = 1;
        for (int i=n;i>0;i--) { //int i = 1; i <= n; i++
            ans = i * ans;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find Factorial :");
        int n = sc.nextInt();
        System.out.println("Factorial of given number is \n"+nFactorial(n));
    }
}
