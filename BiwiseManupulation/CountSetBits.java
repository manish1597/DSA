package BiwiseManupulation;

public class CountSetBits {

    public static void countSetBits(int n){
        int m=n;
        int count =0;
        while (n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        System.out.println("The number of set bits in number "+m+" are\n"+count);
    }

    public static void main(String[] args) {
        countSetBits(4);

    }
}