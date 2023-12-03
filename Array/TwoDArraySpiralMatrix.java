package Array;


public class TwoDArraySpiralMatrix {

    public static void Spiral(int matrix[][]){
        int startrow=0;
        int endrow= matrix.length-1;
        int startcol=0;
        int endcol= matrix[0].length-1;
        while (startrow<=endrow && startcol<=endcol){
            //we use i for row and j for column
            //logic is if row is fix then changing variable is column and vice versa
            //Printing Top Boundary row is fix and column changing
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            //Printing Right boundary column is fix and row changing
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //printing Bottom Boundary Row fix and column changing
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //printing left boundary column fix and row changing
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;




        }

    }
    public static void printArray(int matrix[][]){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();


        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        printArray(matrix);
        System.out.println("Representation of Spiral Matrix is");
        Spiral(matrix);


    }
}