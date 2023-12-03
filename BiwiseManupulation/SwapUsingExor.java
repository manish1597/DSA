package BiwiseManupulation;

import java.util.Scanner;

public class SwapUsingExor {
    public static void swap(int x,int y){
        System.out.println("value of a = "+x+" &"+" value of b ="+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("value of a after swap = "+x+" &"+" value of b after swap ="+y);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a&b ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a,b);
    }
}

