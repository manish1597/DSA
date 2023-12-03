package String;

import java.util.Scanner;

public class MakingtwostringAnagram {
    public static String makeanagram(String s1,String s2){
        for (int i=0;i<s2.length();i++){
            if(s1.indexOf(s2.charAt(i))<=-1){
                return "False";
            }
        }
        return "True";
    }

    public static void main(String[] args) {

        String s1 = "abcd";

        String s2 = "ca";
        System.out.println(makeanagram(s1,s2));


    }

}
