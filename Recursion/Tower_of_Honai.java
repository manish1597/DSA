package Recursion;

public class Tower_of_Honai {
    public static void towerOfHonai(int n,char src,char dst,char hlp){
        if(n==1){
            System.out.println("Move Disk "+n+" from "+src+" to "+dst);
            return;
        }
        towerOfHonai(n-1,src,hlp,dst);
        System.out.println("Move Disk "+n+" from "+src+" to "+dst);
        towerOfHonai(n-1,hlp,dst,src);
    }

    public static void main(String[] args) {
        towerOfHonai(3,'A','C','B');
    }
}
