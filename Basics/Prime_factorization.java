package Basics;


import java.util.Scanner;

public class Prime_factorization {
    public static boolean isprime(int n){
        for( int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimeFactorization(int n){

        for(int i=2;i<n;i++){
            if(isprime(i)){
                int x =i;
                while(n%x==0){
                    System.out.print(i+" ");
                    x=x*i;
                }
            }

        }


    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int  n= sc.nextInt();
        System.out.println("prime factorization series is");
        printPrimeFactorization(n);
    }
}
