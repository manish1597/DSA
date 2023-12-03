package Recursion;

public class BinarySearch_Recursion {
    public static int BinarySearch(int arr[], int k,int start,int end ){
        if(start>end){
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==k){
            return mid;
        }
        if(k<arr[mid]){
            return BinarySearch(arr,k,start,end-1);
        }
        return BinarySearch(arr,k,start+1,end);
    }
    public static int BinarySearch2(int arr[],int k,int start ,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==k){
            return mid;
        }
        if(arr[start]<=arr[mid]){//case 1: Array start less than mid
            if(k>=arr[start]&&k<=arr[mid]){
                return BinarySearch2(arr,k,start,mid-1);
            }
            else {
                return BinarySearch2(arr,k,mid+1,end);
            }

        }

        if(k<=arr[end]&&k>=arr[mid]){
            return BinarySearch2(arr,k,mid+1,end);
        }
        else  {
            return BinarySearch2(arr,k,start,mid-1 );
        }



    }

    public static void main(String[] args) {
        int arr[]={5,10,15,20,30,35,46,99};
        int k=15;
        System.out.println("The index of "+k+" is "+BinarySearch(arr,k,0, arr.length-1));
        System.out.println("The index of "+k+" is "+BinarySearch2(arr,k,0, arr.length-1));

    }
}
