package Basics;



import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PlaceholderinJava {
//    %c - Character
//%d - Decimal number (base 10)
//%e - Exponential floating-point number
//%f - Floating-point number
//%i - Integer (base 10)
//%o - Octal number (base 8)
//%s - String
//%u - Unsigned decimal (integer) number
//%x - Hexadecimal number (base 16)
//%t - Date/time
//%n - Newline

    public static void main(String[] args) {
        float a=33.5678f;
        System.out.printf("The fotmatted float is %.1f",a);
        System.out.println();

        System.out.printf("Hello my name is %s and I am %s","Manish","Batman");
        System.out.println();
        System.out.println("b"+1);
        System.out.println("Whenever string is concat with int value the int value converted into its corresponding wrapper class which call toString()");
        System.out.println("in simple word if oject try to concat whith string it call toString()");
        System.out.println("The + opertor in java only define for premitive or any one expression is String");
        System.out.println(new Integer(53)+" "+new ArrayList<>());
        System.out.println("in above example at least one object is string");

    }


}
