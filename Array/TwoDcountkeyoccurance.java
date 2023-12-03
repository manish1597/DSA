package Array;


public class TwoDcountkeyoccurance {

    public static void printarray(int matrix[][]){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void Countoccurance(int matrix[][],int key){
        int k=key;
        int count =0;
        for (int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(key==matrix[i][j]){
                    count++;
                }
            }
        }
        System.out.println("The count of "+k+" in given array is \n "+count);

    }
    public static void main(String[] args) {
        int matrix[][]={
                {4,7,8},
                {8,8,7}};

        printarray(matrix);
        Countoccurance(matrix,7);
    }
}
