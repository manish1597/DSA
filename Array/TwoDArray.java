package Array;

import java.util.Scanner;

public class TwoDArray {


    public static void main(String[] args) {
        int matrix[][]= new int[3][3];
        int n= matrix.length;
        int m=matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2D array elements fill from row int colunmn which is \n"+"Row="+n+" column="+m);
        //Initialise element in 2D Array
        //Outer loop for row
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]= sc.nextInt();

            }


        }

        // printing Output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();


        }

    }
}
