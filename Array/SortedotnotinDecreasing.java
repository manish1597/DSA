package Array;


import java.util.Scanner;

public class SortedotnotinDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.println("Enter each element of array");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("is Array sorted decreasing ?\n"+arraySortedOrNot(numbers));
    }
    static boolean arraySortedOrNot(int[] arr) {

        for(int i =0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                return true;
            }
        }
        return false;

    }

}
