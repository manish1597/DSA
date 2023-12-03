package Recursion;

public class X_power_optimize {
    public static int powerr(int  x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            int y = powerr(x, n / 2);
            return y * y;
        } else {
            return x * powerr(x, n - 1);
        }
    }
    public static void main(String[] args) {

        System.out.println("X to power n by O(logn) is\n"+powerr(2,5));

    }
}
