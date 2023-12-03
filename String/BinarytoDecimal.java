package String;

import java.util.Scanner;

public class BinarytoDecimal {
    public static int BinarytoDecimal(String str){
        int dec=0;
        int k=1;//because 2 raise to power is zero
        for (int i=str.length()-1;i>=0;i--){
            dec+=(str.charAt(i)-'0')*k;
            k=k*2;
        }
        return dec;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary number");
        String s = sc.nextLine();
        System.out.println("Decimal number is");
        System.out.println(BinarytoDecimal(s));
    }
}

