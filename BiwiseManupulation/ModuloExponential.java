package BiwiseManupulation;

public class ModuloExponential {
    public static long modularExponentiation(long a, long b, long m) {
        long res = 1;
        a = a % m;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % m;
            }
            a = (a * a) % m;
            b = b >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(  modularExponentiation(2,3,5));
    }

}
