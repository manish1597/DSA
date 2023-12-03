package Array;


public class TwoDArrayDiagonalSum {
    public  static void printarray(int matrix[][]){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void PrimaryDiagonalsum(int matrix[][]){
        int sum =0;
        for(int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("The sum of the primary diagonal is\n"+sum);
    }

    public static void primaryandsecondary(int matrix[][]){

        int sum =0;
        for(int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if (i+j== matrix.length-1) {
                    sum+=matrix[i][j];


                }
            }
        }
        System.out.println("The sum of primary and secondary matrix is\n"+sum);

    }

    public static void Optimizeprimaryandsecondary(int matrix[][]){
        int sum=0;
        for (int i=0;i< matrix.length;i++){
            //sum of primary array
            sum+=matrix[i][i];
            //sum of secondary array
            //For odd number of matrix to avoid overlapping condition
            //i not equal to j
            if(i!=matrix.length-1-i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println("The sum of Primary and secondary diagonal by Optimize method is\n"+sum);
    }


    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        printarray(matrix);
        PrimaryDiagonalsum(matrix);
        primaryandsecondary(matrix);
        Optimizeprimaryandsecondary(matrix);

    }
}
