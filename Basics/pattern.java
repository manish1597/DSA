package Basics;


public class pattern {
    public static void main(String[] args){
        //     pattern1(5);
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        // pattern2(5);
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
//        pattern3(5);
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        //pattern4(5);
        //1
        //12
        //123
        //1234
        //12345
        //pattern5(5);
        //*
        //**
        //***
        //****
        //***
        //**
        //*
        //diamond(5);
        //    *
        //   * *
        //  * * *
        // * * * *
        //* * * * *
        // * * * *
        //  * * *
        //   * *
        //    *
//        pattern7(5);
        pattern8(5);
        //        1
        //      2 1 2
        //    3 2 1 2 3
        //  4 3 2 1 2 3 4
        //5 4 3 2 1 2 3 4 5
        //  4 3 2 1 2 3 4
        //    3 2 1 2 3
        //      2 1 2
        //        1
        //
//        pattern9(5);
//        ****
//        ****
//        ****
//        ****
//        ****
        //  pattern10(4);//Character pattern
//        A
//        BC
//        DEF
//        GHIJ

        //    hollow_rectangle(4,5);
//*****
//*   *
//*   *
//*****
        // rotated_pyramid(4);
//   *
//  **
// ***
//****
//      pattern11(5);
//        12345
//        1234
//        123
//        12
//        1

//floyds_triangle(5);
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//zero_one(5);
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
        // Butterfly(5);
// *       *
//**      **
//***    ***
//****  ****
//**********
//**********
//****  ****
//***    ***
//**      **
//*        *
        // solid_rhombus(5);
//    *****
//   *****
//  *****
// *****
//*****
        //   hollow_rhombus(7);
//      ******
//     *    *
//    *    *
//   *    *
//  *    *
// *    *
//******
//        pyramid(9);

        //RECURSION
//        Rpat1(5,0);

// * * * * *
//* * * *
//* * *
//* *
//*
//        Rpat2(4,0);





    }
    static void pattern1(int n) {
        for(int row=1;row<=n;row++){
            //for every row run the column
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern2(int n) {
        for(int row=1;row<=n;row++){
            //for every row run the column
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern3(int n) {
        for(int row=1;row<=n;row++){
            //for every row run the column
            for(int col = 1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern4(int n) {
        for(int row=1;row<=n;row++){
            //for every row run the column
            for(int col = 1; col<=row; col++){
                System.out.print(col);

            }
            System.out.println();

        }
    }
    static void pattern5(int n) {
        for(int row=0;row<n*2;row++){
            //for every row run the column
            int columninRow=row>n?2*n-row :row;
            for(int col = 1; col< columninRow; col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void diamond(int n) {
        for(int row=0;row<2*n;row++){
            //for every row run the column
            int columninRow=row>n?2*n-row :row;
            int space=n-columninRow;
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }

            for(int col = 0; col< columninRow; col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern7(int n) {
        for(int row=1;row<=n;row++){
            int space=n-row;
            for(int s=0;s<space;s++){
                System.out.print("   ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println( );
        }

    }

    static void pattern8(int n) {
        for(int row=1;row<=2*n;row++){
            int columninRow=row>n?2*n-row :row;

            for(int s=0;s<n-columninRow ;s++){
                System.out.print("  ");
            }
            for(int col=columninRow;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=columninRow;col++){
                System.out.print(col+" ");
            }
            System.out.println( );
        }

    }

    static void pattern9(int n){
        for(int i=1;i<=n;i++){
            System.out.println("****");
        }
    }
    static void pattern10(int n) {
        char ch='A';
        for(int row=1;row<=n;row++){
            //for every row run the column
            for(int col=1;col<=row;col++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
    }

    static void hollow_rectangle(int n, int m)
    {
        int i, j;
        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= m; j++)
            {
                if (i == 1 || i == n ||
                        j == 1 || j == m)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void rotated_pyramid(int n){
        for(int row=1;row<=n;row++){
            //For spaces
            for(int col =1;col<=n-row;col++){
                System.out.print(" ");
            }
            for(int col =1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void pattern11(int n) {
        for(int row=1;row<=n;row++){
            //for every row run the column
            for(int col = 1; col<=n-row+1; col++){
                System.out.print(col);

            }
            System.out.println();

        }
    }
    static void floyds_triangle(int n) {
        int count=1;
        for(int row=1;row<=n;row++){
            //for every row run the column
            for(int col=1;col<=row;col++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();

        }
    }
    static void zero_one(int n) {

        for(int row=1;row<=n;row++){
            //for every row run the column
            for(int col=1;col<=row;col++){
                if((row+col)%2==0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();

        }
    }
    public static void Butterfly(int n){
        //1st Half
        for(int i=1;i<=n;i++){
            //Stars = i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Stars =2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //Stars =i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd Half
        for (int i=n;i>=1;i--){
            //Stars = i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Stars =2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //Stars =i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void solid_rhombus(int n){
        //outer loop
        for (int i=1;i<=n;i++){
            //spaces n-i
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars ==n
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void hollow_rhombus(int n)
    {

        for (int i = 1; i <= n; i++)
        {
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++)
            {
                if (i == 1 || i == n ||
                        j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void pyramid(int n){
        for(int i=1;i<=n;i++){
            //spaces =n-i
            for(int j=i;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars 2i-1
            for(int j=0;j<=(2*i)-1;j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    public static void Rpat1(int r,int c){
        if (r==0){
            return;
        }

        if(c<r){
            System.out.print("*"+" ");
            Rpat1(r,c+1);
        }
        else {
            System.out.println();
            Rpat1(r-1,0);
        }
    }
    public static void Rpat2(int r,int c){
        if (r==0){
            return;
        }

        if(c<r){
            Rpat2(r,c+1);
            System.out.print("*"+" ");

        }
        else {
            Rpat2(r-1,0);
            System.out.println();

        }
    }
}