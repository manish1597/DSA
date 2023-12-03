package Divide_and_Conquer;

public class Merge_Sort {


    public static void mergeSort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+(end-start)/2;
        mergeSort(arr, start,mid);//For left part sorting
        mergeSort(arr, mid+1, end);//For right part sorting
        mergeArray(arr,start,mid,end);
    }
    public static void mergeArray(int arr[],int start,int mid,int end){
        int temp[]=new int[end-start+1];// left (0,3)means 4 element,right(4,6) means 3 element
        //Setting Index
        int  i=start;//for left part array index
        int j=mid+1;//for right side array index
        int k=0;//for tempory array index
        while (i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //if all element of j set to temp but still i remaing
        while (i<=mid){
            temp[k++]=arr[i++];
        }

        while (j<=end){
            temp[k++]=arr[j++];

        }

        //Now copy the Array

        for ( k=0,i=start;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];

        }

    }
    public static void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0, arr.length-1);
        printArray(arr);
    }

}
