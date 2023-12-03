package Array;



import java.util.Scanner;

public class ArraylessthanK {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("Enter each element of array");

        for(int i=0;i<n;i++){
            numbers[i]= sc.nextInt();
        }
        System.out.println("Enter the number which you want to compare with array elements ");
        int k= sc.nextInt();
        int latest[]=lessThan(numbers,k);
        System.out.println("New Elements which are less than k is ");
        for(int i=0;i<latest.length;i++){
            System.out.print(latest[i]+" ");
        }

    }



    public static int[] lessThan(int[] numbers, int k) {




        // first we set the count for intializing new array size
        //array size for elements which are less than k
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < k) {
                count++;
            }
        }
        //now we do our actual logic where we assign values(less than k)
        // to new array
        int arr[] = new int[count];
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (numbers[i] < k) {
                arr[j] = numbers[i];
                j++;
            }
        }
        return arr;


    }
}