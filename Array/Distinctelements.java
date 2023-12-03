package Array;



import java.util.Scanner;

public class Distinctelements {
    public static int Distinct(int[]arr){
        int count =0;//for courting distint elements
        boolean isDistinct=true;
        for(int i=0;i< arr.length;i++){
            for (int j=(i-1);j>=0;j--){
                if(arr[i]==arr[j]){
                    isDistinct=false;
                }
            }
            if (isDistinct==true){
                count++;
                isDistinct=true;
            }
        }
        return count;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");

        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.println("Enter each element of array");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Number of distinct elements are\n"+Distinct(numbers));
    }
}
