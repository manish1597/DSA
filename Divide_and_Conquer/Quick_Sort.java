package Divide_and_Conquer;
//O(nlogn) for average case and O(n^2) for worst case (if pivot element is always smaller or larger compare to other elemrnt in array)
public class Quick_Sort {
    public static void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int arr[],int si,int ei){
        if (si>=ei){
            return;
        }

        int pIdx=partition( arr, si, ei);
        quickSort(arr, si, pIdx-1);//for left part
        quickSort(arr, pIdx+1, ei);//for right part

    }

    public static int partition(int arr[],int si ,int ei){
        int pivot = arr[ei];//here we take Ending element as pivot
        int i=si-1;//For making places for those element who's smaller than pivot

        for (int j=si;j<ei;j++){
            if (arr[j]<pivot){
                //make space for smaller element of pivot hence i++
                i++;
                //then swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
        }
        i++;
        //now we place our pivot to there right postion
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        printArray(arr);

    }

}
