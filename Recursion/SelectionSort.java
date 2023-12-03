package Recursion;

public class SelectionSort {

    public static void selection(int arr[],int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selection(arr,r,c+1,c);
            }
            else {
                selection(arr,r,c+1,max);
            }
        }
        else {
            //swap
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selection(arr,r-1,0,0);
        }
    }

    public static void printarray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[]={5,4,7,1,8,11,3,2};
        selection(arr, arr.length,0 ,0);
        printarray(arr);


    }
}

