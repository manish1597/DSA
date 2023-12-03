package Recursion;

public class X_to_the_power_N {
    public static int power(int n,int p){
        if(p==0){
            return 1;
        }
        int nm1=power(n,p-1);
        int pow=n*nm1;
        return pow;
    }
    public static void main(String[] args) {
        System.out.println("x power n by naive method is \n"+power(2,5));

    }
}
