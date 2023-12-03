package Backtracking;


public class Array_Backtracking {
    public static void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void arrayBacktracking(int arr[],int i,int val){
        //Base case
        if (i==arr.length){
            printArray(arr);
            return;
        }

        //Recursion
        arr[i]=val;
        arrayBacktracking(arr,i+1,val+1);//recursion function
        arr[i]=arr[i]-2;//Backtracking step
    }

    public static void main(String[] args) {
        int arr1[]= new int[5];
//        printArray(arr);
        arrayBacktracking(arr1,0,1);
        System.out.println("Array After backtracking by -2  is");
        printArray(arr1);

    }

}
