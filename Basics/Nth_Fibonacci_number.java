package Basics;


import java.util.Scanner;

public class Nth_Fibonacci_number {
    public static int Fibonacci(int n){
        int arr[]=new int[n+1];
        if(n==1||n==2) return 1;
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        for(int i=3;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }

        return arr[n];

    }




    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter find nth Fibonacci number");
        int n = sc.nextInt();
        System.out.println("Nth term of Fibonacci series is\n"+Fibonacci(n));
    }
}
