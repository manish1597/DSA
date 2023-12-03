package Recursion;

public class LinearSearch_Recursion {

    public static int linearSearch(int arr[],int k,int i){
        if(i== arr.length){
            return -1;
        }
        if(arr[i]==k){
            return i;
        }
        return linearSearch(arr,k,i+1);

    }

    public static void main(String[] args) {
        int arr[]={2,4,6,7,8,9,12,15};
        int k=8;
        System.out.println("Linear Search by Binary The index of "+k+" is\n"+linearSearch(arr,k,0));

    }
}
