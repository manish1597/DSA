package String;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    //optimize method
    static final int CHAR=256;
    static boolean Anagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        int count[]= new int[CHAR];
        for( int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;

        }
        for(int i=0;i<CHAR;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
    //Naive Method
    static boolean isanagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char a1[]= s1.toCharArray();
        Arrays.sort(a1);
        s1 =new String(a1);

        char a2[]= s2.toCharArray();
        Arrays.sort(a2);
        s2 =new String(a2);

        return s1.equals(s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER first string");
        String s1 = sc.nextLine();
        System.out.println("ENTER second string");
        String s2 = sc.nextLine();
//       System.out.println("is given strings are anagram?\n"+Anagram(s1,s2));
       System.out.println("is given strings are anagram?by naive method\n"+Anagram(s1,s2));

    }
}
