package Basics;


import java.util.Scanner;

public class Leap_year {
    public static void utility(int y){
        String isLeap = "False";
        if(y%4==0 && y%100!=0){
            isLeap="True";
            System.out.println(isLeap);
        }
        else if(y%400==0){
            isLeap="True";
            System.out.println(isLeap) ;
        }

        else{
            System.out.println(isLeap);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year that you want to check leap year or not ");
        int y = sc.nextInt();
        System.out.println("is given year is leap year?");
        utility(y);

    }
}
