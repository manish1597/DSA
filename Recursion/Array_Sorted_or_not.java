package Recursion;

public class Array_Sorted_or_not {
    public static boolean isSorted(int arr[],int i){
        if(i== arr.length-1){
            return true;
        }

        if(arr[i+1]<arr[i]){
            return false;
        }
        return isSorted(arr,i+1);

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int arr1[]={1,2,3,7,5,6,};
        System.out.println("Is given Array is sorted in increasing order?\n"+isSorted(arr1,0));
    }
}
