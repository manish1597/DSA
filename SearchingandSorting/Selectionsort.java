package SearchingandSorting;
//TIME COMPLEXITY O(n^2)
public class Selectionsort {
    public static void selectionSort(int arr[]){
        for (int turn =0;turn<arr.length-1;turn++){
            int smallest=turn;//we assume our first element is smallest element
            for(int j=turn+1;j<arr.length;j++){
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[turn];
            arr[turn]=temp;
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[]={5,4,7,1,8,11,3,2};
        selectionSort(arr);
        printarray(arr);

    }
}
