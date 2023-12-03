package String;


import java.util.Arrays;
import java.util.Scanner;

public class FindExtraCharacter {
    public static char Findextra(String str1,String str2){
        char ch1[]= str1.toCharArray();
        Arrays.sort(ch1);
        char ch2[] =str2.toCharArray();
        Arrays.sort(ch2);
        int n= str1.length();
        for(int i=0;i<n;i++){
            if(ch1[i]!=ch2[i]){
                return ch1[i];

            }
        }
        return ch2[n];
    }
    public static char Findextrabybitwise(String str1,String str2){
        int result =0;
        int n= str1.length();
        for(int i=0;i<n;i++){
            result=result^str1.charAt(i)^str2.charAt(i);

        }
        result =result^str2.charAt(n);
        return (char) result;


    }
    public static char Findextrabyoptimize(String str1,String str2){
        int count[]= new int[26];
        int n=str1.length();
        for( int i=0;i<n;i++){
            count[str1.charAt(i)-'a']--;
            count[str2.charAt(i)-'a']++;

        }
        count[str2.charAt(n)-'a']++;
        for (int i=0;i<26;i++){
            if (count[i]==1){
                return (char)(i+'a');
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string");
        String str1 = sc.nextLine();
        System.out.println("Enter 2nd string");
        String str2 = sc.nextLine();
       // System.out.println("Extra character is //bye naive method\n"+Findextra(str1,str2));
//        System.out.println("Extra character is //bye Bitwise Method \n"+Findextrabybitwise(str1,str2));
        System.out.println("Extra character is //bye Optimize Method \n"+Findextrabyoptimize(str1,str2));

    }

}
