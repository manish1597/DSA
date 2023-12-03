package BiwiseManupulation;


public class UppercasetoLowercase {
    public static void main(String[] args) {
        for(char ch='A';ch<='Z';ch++){
            System.out.print((char) (ch |' ')+" ");
        }
    }
}
