package Basics;


public class DecimaltoBinary {
    public static void decToBinary(int n){
        int mynum=n;
        int pow=0;
        int binum=0;
        while(n>0){
            int rem=n%2;
            binum+=(rem*(int)Math.pow(10,pow) );
            pow++;
            n=n/2;

        }
        System.out.println("Decimal of "+mynum+"="+binum);
    }

    public static void main(String[] args) {
        decToBinary(4);
        //System.out.println("hello");
    }
}
