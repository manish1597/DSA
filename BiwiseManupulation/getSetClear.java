package BiwiseManupulation;

import java.util.Scanner;

public class getSetClear {
    public static int  getIthpostion (int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;

        }
        else {
            return 1;
        }
    }
    public static int setIthBit(int n ,int i){
        int bitmask=1<<i;
        return n|bitmask;


    }
    public static int clearIthBit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }

    public static int updateIthBit(int n,int i,int newbit){
        if(newbit==0){
            return clearIthBit(n,i);
        }
        else {
            return setIthBit(n,i);
        }
//        n=clearIthBit(n,i);
//        int bitmask=newbit<<i;//if new bit is zero then number as it is
//        return n|bitmask;

    }

    public static int clearBitRange(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b= (i<<i)-1;
        int bitmask = a|b;
        return n & bitmask;
    }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int n= sc.nextInt();
        //All operation done from LSb
        System.out.println("Enter i'th position");
        int i= sc.nextInt();
        System.out.println("we get the ith postion which is\n"+getIthpostion(n,i));
        System.out.println("The number after set ith position is\n"+setIthBit(n,i));
        System.out.println("The number after clear ith position is\n"+clearIthBit(n,i));
        System.out.println("The number after update ith bit is\n"+updateIthBit(10,2,0));
        System.out.println("The clear range\n"+clearBitRange(10,2,4));


    }
}
