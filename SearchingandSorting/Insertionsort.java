package SearchingandSorting;

public class Insertionsort {



    public static void insertionSort(int[] arr){
        for (int i=1;i< arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];//previous element is push to next element
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }

    }

    public static void printarray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }


    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertionSort(arr);
        printarray(arr);


    }
}

//    In simple terms, the outer loop is going through the array one element at a time, and inner
//oop is checking each element on its left side, if any element is greater than the current
//element it is shifting that element to its right side, so the current element can be inserted in
//its correct position.