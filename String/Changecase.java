package String;

import java.util.Scanner;

public class Changecase {
    public static void Changecases(String s){
        System.out.println("Capitalise string is ...");
        System.out.println(s.substring(0,1).toUpperCase()+s.substring(1,s.length()));
        System.out.println("Upper case string is..");
        System.out.println(s.toUpperCase());
        System.out.println("Lower case string is..\n"+s.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        Changecases(s);

    }



}
