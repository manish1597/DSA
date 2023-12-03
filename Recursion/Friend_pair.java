package Recursion;

import java.util.Scanner;

public class Friend_pair {

    public static int friendPair(int n){
        if(n==1 ||n==2){
            return n;
        }
        //for single choice means single person
        int fnm1=friendPair(n-1);
        //for pair choices
        int fnm2=friendPair(n-2);
        int pairways=fnm1*fnm2;
        return fnm1+pairways;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of person ");
        int n= sc.nextInt();
        System.out.println("The no. of pair of n person is (while each person paired only once)\n"+friendPair(n));
    }
}
