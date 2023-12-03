package Backtracking;

public class gridWays {

    public static int  gridwaysRightnDown(int i,int j,int n,int m){
        //Base case
        if(i==n-1&&j==m-1){//conditon for last cell
            return 1;//means we have only one way at last cell
        } else if (i==n || j==m) {//means no down ways left and right ways means were at last row &column of grid no right and down grid left
            return 0;

        }


        //Recursion
        int w1=gridwaysRightnDown(i,j+1,n,m);//Right moves i is constant j is changing
        int w2=gridwaysRightnDown(i+1,j,n,m);//Down moves i is changing j is constant
        return w1+w2;
    }

    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println("Total no. of ways (TC:  2^n+m) is\n"+gridwaysRightnDown(0,0,n,m));

    }
}
