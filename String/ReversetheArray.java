package String;

import java.util.Scanner;

public class ReversetheArray {

    public static String reverseString(String s){

//        String rev="";
//        for(int i=s.length()-1;i>=0;i--){
//            rev=rev+s.charAt(i);//add one element one by one thats why we use +
//        }
//        return rev;
        StringBuffer n= new StringBuffer(s);
        n.reverse();
        return n.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("string after reverse");
        System.out.println(reverseString(s));
    }
}
