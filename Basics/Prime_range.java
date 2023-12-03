package Basics;


import java.util.Scanner;

public class Prime_range {
    public static boolean prime(int n){


        if(n==1)return false;//1 is not prime nor composite
        if(n==2||n==3)return true;//2&3 are prime no. we skip the test
        if(n%2==0||n%3==0)return false;
        for(int i=5;i*i<n;i=i+6){//start from 5 and factors always in pair jump to 11 by adding 6
            if(n%i==0||n%(i+2)==0)return false;//to check 7
        }
        return true;
    }
    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }

    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number to print prime series");
        int n = sc.nextInt();
        System.out.println("Prime series is");
        primeRange(n);




    }


}
