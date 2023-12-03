package String;

import java.util.Scanner;

public class IsPalindrome {
    public static boolean isPalin(String str){
        if(str==null|| str.length()==0){
            System.out.println("Given string is null or empty");
            return false;
        }

        //Here we are create indexing for charAt()
        int start =0;
        int end =str.length()-1;
        str=str.toUpperCase();//this important
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
    public static boolean palin(String str){
        if(str==null || str.length()==0){
            System.out.println("Given string is null or Empty");
            return false;
        }
        str=str.toUpperCase();
        for (int i=0;i<str.length()/2;i++){
            int n=str.length();
            if (str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to check it is Palindrome or not");
        String s = sc.nextLine();
        System.out.println("is given word is Palindrome\n"+isPalin(s));
//        System.out.println("is given word is Palindrome by length/2 merhod\n"+palin(s));


    }
}
