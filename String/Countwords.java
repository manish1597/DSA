package String;

import java.util.Scanner;

public class Countwords {
    public static int countWords(String str)
    {
        int space =1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){// Here we have to calculate space in between


                space++;
            }
        }
        return space;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER the sentence to calculate words in that");
        String str = sc.nextLine();
        System.out.println("The no. of words in given sentence is\n"+countWords(str));
    }

}
