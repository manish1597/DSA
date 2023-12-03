package Recursion;

public class Occurance_Of_key {
    public static int firstOccurance(int arr[],int key,int i){//First compare with ourself then Look forward
        if (i== arr.length){
            return -1;
        }

        if (arr[i]==key){
            return i;
        }
        return firstOccurance(arr,key,i+1);
    }

    public static int lastOccurance(int arr[],int key,int i){//first Look Forward then compare with ourself
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurance(arr,key,i+1);
        if(isFound==-1&& arr[i]==key){
            return i;
        }
        return isFound;

    }
    public static void main(String[] args) {
        int arr[]={2,3,4,12,32,4,76,43,3,55};
        int  key=4;
        System.out.println("The First  Occurance of "+key+" is\n"+firstOccurance(arr,key,0));
        System.out.println("The Last Occurance of "+key+" is\n"+lastOccurance(arr,key,0));

    }
}
