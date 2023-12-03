package Recursion;

public class IncreasindandDecreasingOrder {

    public static void decreasing(int n){
        //step 1 define base case
        //step 2 operation by recursion funtion
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");//what we have to print
        decreasing(n-1);//recursive function
    }
    public static void increasing(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        increasing(n-1);
        System.out.print(n+" ");
    }
    public static void both(int n){
        //base case
        if (n==0){
            return;
        }

        //recursion
        System.out.print(n+" ");
        both(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n=10;
//        System.out.println("Decreasing order by recursion is ");
//        decreasing(n);
        System.out.println("\nIncreasing order by recursion is");
//        increasing(n);

        both(n);
    }
}
