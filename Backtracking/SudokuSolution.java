package Backtracking;

public class SudokuSolution {
    public static boolean sodukoSolver(int sudoku[][],int row,int col){//it tell us true or false weather it find solution or not
        //Base case
        if(row==9){
            //soduko is completly solve
            return true;
        }

        //Recursion
        //Setting up row and column
        int nextrow=row ,nextcol=col+1;//default case means in current row the col increase
        //when will row increase?
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(sudoku[row][col] != 0  ){
            return sodukoSolver(sudoku,nextrow,nextcol);
        }
        //and when will these  new element placed? ans: if and only if no other element present there
        //Place the digits 0 to 9
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){//if it safe then place the digits
                sudoku[row][col]=digit;//now place the digit
                if(sodukoSolver(sudoku,nextrow, nextcol)){//it it true the Solution exit
                    return true;

                }
                //if solution is not exit we reset sudoko[row][col]=0
                sudoku[row][col]=0;//means in this positon we don't want to place element

            }
        }

        return false;
    }
    public static boolean isSafe(int sudoko[][],int row ,int col,int digit){
        //column
        for(int i=0;i<=8;i++){
            if(sudoko[i][col]==digit){
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++){
            if(sudoko[row][j]==digit){
                return false;
            }
        }
        //now 3 by 3 Grid check
        //now we calculating starting row and column index of current grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        //now simple 2D array traverse
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoko[i][j]==digit){
                    return false;
                }
            }
        }
        return true; //safe position to place that element
    }
    public static void printSudoko(int arr[][]){
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][]={{0,0,8,0,0,0,0,0,0},
                {4,9,0,1,5,7,0,0,2},
                {0,0,3,0,0,4,1,9,0},
                {1,8,5,0,6,0,0,2,0},
                {0,0,0,0,2,0,0,6,0},
                {9,6,0,4,0,5,3,0,0},
                {0,3,0,0,7,2,0,0,4},
                {0,4,9,0,3,0,0,5,7},
                {8,2,7,0,0,9,0,1,3}};
        int sudoku1[][]={
                {8,0,0,0,0,1,0,7,2},
                {5,2,7,6,4,0,0,3,0},
                {0,0,0,8,0,7,5,0,9},
                {0,8,0,4,9,0,1,0,0},
                {0,0,0,2,1,0,3,9,0},
                {0,0,6,0,5,3,0,0,4},
                {0,0,0,0,0,0,4,0,0},
                {0,0,9,1,8,5,0,6,0},
                {6,0,1,3,7,0,9,2,0}
        };



        if(sodukoSolver(sudoku1,0,0)){
            System.out.println("Solution exists");
            printSudoko(sudoku1);
        }else {
            System.out.println("Solution is not exists");
        }
    }
}
