package Stack;

import java.util.Stack;

public class Reverse_Str {
    public static String reverse (String str){
        //Add all character of string in character stack
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        //Now pop the elements and store into string Builder
        StringBuilder result =new StringBuilder(" ");

        while (!s.isEmpty()) {
            result.append(s.pop());
        }
        return result.toString();


    }

    public static void main(String[] args) {
        String str="abc";
        String ans=reverse(str);
        System.out.println("Reverse string is \n"+ans);

    }
}
