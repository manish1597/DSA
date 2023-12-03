package Recursion;

public class BasicConcept {

    //INFINITE LOOP FIGURE OUT HOW TO FIX THIS PROGRAM
    //BY (--n)
    public static void nminusminus(int n){
        if(n==0){
            return;
        }

        System.out.print(n+" ");
        nminusminus(n--);
    }
    static int sum=0;
    public static void reverseTheNumber(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverseTheNumber(n/10);

    }
    static int count =0;
    public static void countzero(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        if (rem==0){
            count++;
        }
        countzero(n/10);
    }


    public static void main(String[] args) {
        int n=5;
        int m=873;
        int k=200050;
//        System.out.println(fun(n));
//        nminusminus(n);
//        reverseTheNumber(m);
//        System.out.println(sum);
        countzero(k);
        System.out.println(count);


    }
}
