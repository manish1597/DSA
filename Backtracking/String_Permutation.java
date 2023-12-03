package Backtracking;

public class String_Permutation {
    public static void findPermutation(String str,String ans){
        //Base case
        if(str.length()==0){//means string is empty now
            System.out.print(ans+" ");
            return;

        }

        //Recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);//store character to current,Now every charcter has choice to place it or not

            //now remove this curr character from string
            //"abcde" remove c, ab+de=abde
            String newstr=str.substring(0,i)+str.substring(i+1);
            findPermutation(newstr,ans+curr);
        }
    }

    public static void main(String[] args) {
        String str="abc";
        System.out.println("Premutatio is (with O(n*n!))");
        findPermutation(str,"");

    }
}
//A call stack is the sequence of method calls in a program that lead to a particular point of execution. In the case of the above program, the call stack can be visualized as follows:
//
//The main method calls "findPermutation" with "str" set to "abc" and "ans" set to an empty string.
//
//The first iteration of the loop in the "findPermutation" method chooses the first character from "str", which is "a".
//
//The "findPermutation" method is called again with the updated "str" set to "bc" and "ans" set to "a".
//
//The first iteration of the loop in the new call to "findPermutation" chooses the first character from the updated "str", which is "b".
//
//The "findPermutation" method is called again with the updated "str" set to "c" and "ans" set to "ab".
//
//The length of the updated "str" is now 0, which means a complete permutation has been generated. The permutation "abc" is printed.
//
//The call to the "findPermutation" method with "str" set to "c" and "ans" set to "ab" returns, and control is passed back to the previous call of the method with "str" set to "bc" and "ans" set to "a".
//
//The second iteration of the loop in the previous call of the "findPermutation" method chooses the second character from "str", which is "c".
//
//The "findPermutation" method is called again with the updated "str" set to "b" and "ans" set to "ac".
//
//The length of the updated "str" is now 0, which means a complete permutation has been generated. The permutation "acb" is printed.
//
//The process repeats for the remaining permutations, and all possible permutations of the input string "abc" are generated and printed.
//
//So, the call stack of the program shows the sequence of method calls that are made to generate and print all possible permutations of the input string "abc".