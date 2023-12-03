package Basics;


public class Biniomial_coeff {
    public static int nFactorial(int n) {
        int ans = 1;
        for (int i=n;i>0;i--) { //int i = 1; i <= n; i++
            ans = i * ans;
        }

        return ans;
    }
    public static int binomial(int n ,int r){
        int n_fact=nFactorial(n);
        int r_fact=nFactorial(r);
        int nmr =nFactorial(n-r);
        int bin=n_fact/(r_fact*(nmr));
        return bin;

    }



    public static void main(String[] args) {
        System.out.println("Binomial coefficient is\n "+binomial(5,2));
    }

}
