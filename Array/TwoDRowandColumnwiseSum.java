package Array;


public class TwoDRowandColumnwiseSum {

    public static void printarray(int matrix[][]){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void secondRowSum(int matrix[][]){
        //in row sum Row is constant and column is changing
        int sum=0;

        for (int j=0;j<matrix[0].length;j++){

            sum+=matrix[1][j];

        }

        System.out.println("The sum of second row is \n"+sum);
    }
    public static void Thirdcolumnsum(int matrix[][]){
        //in column search column is constant and row is changing
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][2];
        }
        System.out.println("The sum of third row is \n"+sum);
    }

    public static void main(String[] args) {
        int matrix[][]={
                {1,4,9},
                {11,4,3},
                {2,2,3}
        };

        printarray(matrix);
        secondRowSum(matrix);
        Thirdcolumnsum(matrix);


    }
}
