package String;

import java.util.Scanner;

public class DecimaltoBinary {
    public static void DecimaltoBinary(String str){
        int n=Integer.parseInt(str);
        String s="";
        while(n>0){
            s=n%2+s;//we have to catch reminder
            n=n/2;
        }
        System.out.println("Binary number is\n"+s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal number");
        String s = sc.nextLine();
        DecimaltoBinary(s);
    }
}

