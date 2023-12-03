package Array;

import java.util.Scanner;

public class TwoDArrayLargestElement {
    public static void Largest(int arr[][]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(large<arr[i][j]){
                    large=arr[i][j];
                }

            }

        }
        System.out.print("The largest element is \n"+large);


    }


    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2D array elements fill from row int colunmn which is \n" + "Row=" + n + "column=" + m);
        //Initialise element in 2D Array
        //Outer loop for row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();

            }


        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();


        }

        Largest(matrix);

    }
}
