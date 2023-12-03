package Basics;


public class ReversetheNumber {
    public static void reverse(int n){
        int sum=0;
        while (n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n=345;
        reverse(n);
    }
}
