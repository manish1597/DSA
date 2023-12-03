package Basics;

import java.util.Scanner;

public class Even_odd_sum {
    public static void main(String[] args) {
        int n;
        int choice;
        int even =0;
        int odd=0;
        Scanner sc =new Scanner(System.in);
        do {
            System.out.println("Enter the number\n");
            n =sc.nextInt();
            if (n%2==0){
                even+=n;

            }
            else{
                odd+=n;
            }
            System.out.println("For continue press 1 for exit press 0");
            choice= sc.nextInt();
        }while(choice==1);
        System.out.println("Even no. sum is\n"+even);
        System.out.println("Odd no. sum is\n"+odd);


    }
}
