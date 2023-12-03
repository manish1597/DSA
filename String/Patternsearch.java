package String;

import java.util.Scanner;

public class Patternsearch {
    public static void patternsearch1(String str1,String str2){
        int pos =str1.indexOf(str2);
        while(pos>=0){
            System.out.print(pos+" ");
            pos =str1.indexOf(str2,pos+1);
        }
    }
    public static void patternsearch2(String str1,String str2){
        for(int i=0;i<=str1.length()-str2.length()+1;i++){
            if(str1.substring(i,i+str2.length()).equals(str2));
            System.out.print(i+" ");

        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = sc.nextLine();
        System.out.println("Enter 2nd string");
        String str2 = sc.nextLine();
        System.out.println("Index of pattern is ");
        patternsearch1(str1.toLowerCase(),str2.toLowerCase());
        //patternsearch2(str1,str2);
    }

}
