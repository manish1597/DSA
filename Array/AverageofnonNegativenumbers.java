package Array;


import java.util.Scanner;

public class AverageofnonNegativenumbers {
    public static double posAverage(int[] numbers){

        double count=0;
        double sum=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>=0){
                sum+=numbers[i];
                count++;
            }
        }
        double avg =sum/count;

        return avg;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter each element of array");
        //7
        //-12 8 -7 6 12 -9 14 use this input
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Average of given array is \n"+posAverage(arr));
    }
}
