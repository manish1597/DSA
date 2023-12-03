package Basics;


import java.util.Scanner;

public class Day_before_n_days {

    public static void utility(int d, int n){

        int x =n%7;
        int ans =d-x;
        if(ans>=0){
            System.out.print(ans);
        }
        else{
            System.out.print(ans+7);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number varries from 0 to 6 \n   0 - Sunday\n" +
                "\n" +
                "1 - Monday\n" +
                "\n" +
                "2 - Tuesday\n" +
                "\n" +
                "3 - Wednesday\n" +
                "\n" +
                "4 - Thursday\n" +
                "\n" +
                "5 - Friday\n" +
                "\n" +
                "6 - Saturday \n");
        int d = sc.nextInt();
        System.out.println("Enter number to find day bebore N days");
        int n = sc.nextInt();
        System.out.println("Enter number to find day bebore N days is ");
        utility(d,n);


    }
}
