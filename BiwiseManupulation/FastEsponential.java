package BiwiseManupulation;


import java.util.Scanner;

public class FastEsponential {
    public static int fastExponential(int a,int n){
        int ans=1;
        while (n>0) {


            if ((n & 1) != 0) {//cheking LSB if it is 1 we can update ans
                ans = a * ans;

            }
            a = a * a;
            n = n >> 1;
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a= sc.nextInt();
        System.out.println("Enter raise to the power");
        int n= sc.nextInt();
        System.out.println("The output is (with O(logn)) \n"+fastExponential(a,n));
    }

}
