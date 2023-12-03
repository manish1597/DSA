package Array;



//Time complexity O(row+col) i.e O(n+m)
public class TwoDStairCase {

    public static void printarray(int matrix[][]){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static boolean StaircaseSearch(int matrix[][],int key){
        //if we start from Top right end i.e 40
        //we have to set the cell that's why we set row and column
        int k=key;//only for key printing purpose
        int row=0;
        int col=matrix[0].length-1;
        while (row<matrix.length && col>=0){
            if(key==matrix[row][col]){
                System.out.print("The index of key "+k+" is \n"+"("+row+","+col+")");
                return true;
            }
            else if (key<matrix[row][col]) {//we go on left side
                col--;

            }
            else {//key >matrix[row][col] we go on downword
                row++;

            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static boolean StaircasebyLeftBottom(int matrix[][],int key){
        int k =key;
        int row=matrix.length-1;
        int col=0;
        while (row>=0 && col<matrix[0].length){
            if (key==matrix[row][col]){
                System.out.print("The index of key "+k+" is \n"+"("+row+","+col+")");
                return true;

            }
            else if (key<matrix[row][col]) {
                row--;

            }
            else {//key>matrix[row][col]
                col++;
            }
        }
        System.out.println("key not found!");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][]={
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50} };

        printarray(matrix);
        StaircaseSearch(matrix,33);
//        StaircasebyLeftBottom(matrix,45);


    }
}
