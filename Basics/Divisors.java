package Basics;


import java.util.Scanner;

public class Divisors {
    public static void divisor(int n){

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number to find divisors of that number :");
        int n = sc.nextInt();
        System.out.println("Divisors are " );
        divisor(n);



    }

}
