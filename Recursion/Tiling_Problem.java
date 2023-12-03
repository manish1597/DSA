package Recursion;

import java.util.Scanner;

public class Tiling_Problem {
    public static int tillingProblem(int n){//here n is length for 2*n
        if(n==0 ||n==1 ){
            return 1;
        }
        int verticalway=tillingProblem(n-1);//for 2*1 size tile
        int horzontalway=tillingProblem(n-2);
        return verticalway+horzontalway;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n where n is length for 2*n floor");
        int n= sc.nextInt();
        System.out.println("The no. of way to arrange tiles of 2*1 for 2*n floor is \n"+tillingProblem(n));

    }
}
