package Array;


import java.util.Scanner;

public class Evenoddseperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int numbers[] = new int[n];
        System.out.println("Enter each element of array");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int latest[]=evenOdd(numbers);
        System.out.println("New Array is ");
        for(int i=0;i<latest.length;i++){
            System.out.print(latest[i]+" ");


        }

    }
    public static int[] evenOdd(int[] numbers){


        int count =0;
        int evenodd[]=new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                evenodd[count]=numbers[i];
                count++;
            }
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2!=0){
                evenodd[count]=numbers[i];
                count++;
            }

        }
        return evenodd;


    }

}
