package Basics;


import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lcm {
    public static int Lcm(int a, int b){
        int y=a*b;
        int z=Math.max(a,b);
        int ans=z;
        for(int i=z;i<=y;i++){
            if(i%a==0&&i%b==0){
                ans =i;
                break;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number two numbers to find LCM :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Lcm of two number is:"+Lcm(a,b));





    }



}
