package Backtracking;

import java.util.Scanner;
//TC:O(n!)
public class N_Queen {
    public static void nQueen(char board[][],int row){
        //Base case
        if(row== board.length){
            printBoard(board);
            count++;
            return;
        }
        //Recursion
        //for column
        for(int j=0;j<board[0].length;j++){
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                //now set Queen to next row
                nQueen(board, row + 1);//Recursion call
                board[row][j] = 'x';//Backtracking call
            }
        }
    }

    public static boolean nQueenonlysolution(char board[][],int row){
        //Base case
        if(row== board.length){
//            printBoard(board);
            count++;
            return true;
        }
        //Recursion
        //for column
        for(int j=0;j<board[0].length;j++){
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                //now set Queen to next row
                if(nQueenonlysolution(board, row + 1)){//Recursion call
                    return true;
                }
                board[row][j] = 'x';//Backtracking call
            }
        }
        return false;
    }
    public static boolean isSafe(char board[][],int row,int col){
        //Vertically check column is constant
        for (int i=row;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Diagonally left check row-1 and j-1
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //Diagonally rigth check row-1 and j+1
        for(int i=row-1,j=col+1;i>=0 && j<board[0].length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]){
        System.out.println("-------Chess Board-------");
        for(int i=0;i< board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static int count=0;

    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter n");
//        int n= sc.nextInt();
        int n=4;
        char chessboard[][]= new char[n][n];
        //now we itialize the chess board
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chessboard[i][j]='x';
            }
            System.out.println();
        }

        nQueen(chessboard,0);
        System.out.println("Total ways to solve n queen = "+count);

        //For printing only one solution

//        if(nQueenonlysolution(chessboard,0)){
//            System.out.println("solution is possible");
//            printBoard(chessboard);
//        }else {
//            System.out.println("solution is not possible");
//        }
//        System.out.println("Total ways to solve n queen = "+count);

    }
}
