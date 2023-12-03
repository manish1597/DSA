package Recursion;

public class BubbleSort {

    public static void bubblesort(int arr[],int r,int c){
        if(r==0){
            return;
        }

        if(c<r){
            if(arr[c+1]<arr[c]){
                //swap
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubblesort(arr,r,c+1);
        }
        else {
            bubblesort(arr,r-1,0);
        }
    }

    public static void printarray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[]={5,4,7,1,8,3,2};
        bubblesort(arr, arr.length-1, 0);
        printarray(arr);

    }
}
