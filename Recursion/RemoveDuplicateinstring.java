package Recursion;

import java.util.Scanner;

public class RemoveDuplicateinstring {
    public static void removeDuplicate(String str,int i,boolean count[],StringBuilder newstr){

        if(i==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar= str.charAt(i);
        if (count[currchar-'a']==true){//This mean we have duplicate character
            removeDuplicate(str,i+1,count,newstr);

        }
        //Now we add to newstr
        else {
            count[currchar - 'a']=true;
            removeDuplicate(str,i+1,count,newstr.append(currchar));
        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any String");
        String str=sc.nextLine();
        System.out.println("New String After Removal of Duplicates");
        removeDuplicate(str,0,new boolean[26],new StringBuilder(""));

    }

}
