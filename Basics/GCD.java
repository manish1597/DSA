package Basics;


import java.util.Scanner;

public class GCD {

    public static int gcd(int a, int b){
        int x=Math.min(a,b);
        int ans =0;
        for(int i=1;i<=x;i++){
            if(a%i==0&&b%i==0){
                ans=i;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number two numbers to find GCD ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD of two number is\n"+gcd(a,b));
    }
}