package Array;


import java.util.Scanner;
//this example of linear search
public class TwoDArrayKeySearch {


    public static boolean Search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("the index of key is ( "+i+","+j+")");
                    return true;
                }


            }
        }
        System.out.println("key not found");
        return false;

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
        Search(matrix,5);

    }

}
