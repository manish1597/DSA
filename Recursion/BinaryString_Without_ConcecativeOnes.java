package Recursion;

public class BinaryString_Without_ConcecativeOnes {

    public static void printString(int n,int lastplace, String str){

        if(n==0){
            System.out.println(str);
            return;
        }
        printString(n-1,0,str+"0");
        if (lastplace==0){
            printString(n-1,1,str+"1");
        }
    }

    public static void printStringwithouconsecutivezro(int n,int lastplace, String str){
//if n =0 ""
//if n=1 0,1
//if n=2 01 /10 /11
//if n=3  111/101/110/011/010

        if(n==0){
            System.out.println(str);
            return;
        }
        printStringwithouconsecutivezro(n-1,1,str+"1");
        if(lastplace==1){
            printStringwithouconsecutivezro(n-1,0,str+"0");
        }

    }

    public static void main(String[] args) {
        System.out.println("Withot concecutive ones");
        printString(3,0,"");
        System.out.println("Withot concecutive zero");
        printStringwithouconsecutivezro(3,1,"");
    }
}
//    an integer "n" which represents the desired length of the binary string.
//        an integer "lastdigit" which is used to track the last digit added to the current binary string.
//        a String "str" which is used to store the current binary string being built.
//        The function starts by checking if "n" is equal to 0. If it is, it means that a binary string of the desired length has been built and it prints the current value of "str" and then exits the function.
//
//        If "n" is not equal to 0, the function calls itself twice:
//
//        once with the value of "n" decremented by 1, "lastdigit" set to 0, and "str" concatenated with "0". This call represents the case where the next digit in the binary string is 0.
//        once with the value of "n" decremented by 1, "lastdigit" set to 1, and "str" concatenated with "1" but only if lastdigit is zero. This call represents the case where the next digit in the binary string is 1.
//        When the function is called with "n" decremented by 1, it essentially means that the function is working on a smaller problem where it has to generate a binary string of length "n-1" instead of "n". By making these recursive calls, the function generates all possible binary strings of length "n" by concatenating "0" or "1" to the current binary string being built.
//
//        It's worth noting that this function also includes an optimization where it checks if the last digit added to the current binary string is 0 or not. If the last digit is 0, the function calls itself with "lastdigit" set to 1 and "str" concatenated with "1", otherwise, it does not call itself with "lastdigit" set to 1 and "str" concatenated with "1". This optimization is made to prevent the function from generating duplicate strings.
//
//        In summary, this function will generate and print all possible binary strings of length n by repeatedly decreasing the value of n and concatenating "0" or "1" to the current binary string being built.