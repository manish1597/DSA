package String;

import java.util.Scanner;

public class PrintInBetweenAlphabets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First character");
        char c1 =sc.next().charAt(0);//next() return the tokenized text and nextLine() returns all text upto line break
        System.out.println("Enter Second character");
        char c2 =sc.next().charAt(0);
        System.out.println("character with there Ascii values");
        for(int i=c1;i<=c2;i++){
            System.out.print((char)i+"="+i+" ");//or declare i as char variable
        }
    }
}
