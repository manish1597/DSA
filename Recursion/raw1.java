package Recursion;

public class raw1 {
    public static void add(int arr[],int i,int val){
        if(i==arr.length){
            return;
        }
        arr[i]=val;
        add(arr,i+1,val+1);
    }

    public static void print(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        add(arr,0,1);
        print(arr);
    }
}
