package SearchingandSorting;
//TIME COMPLEXITY =O(n^2)
//O(n) for sorted array
public class Buublesort {
    public static void bubbleSort(int arr[]){

//        First we calculate the turns which 0 to n-2
        for(int turn =0;turn< arr.length-1;turn++){//if n=5 ,n-2=3 and also turn<4 also goes to only 3rd index
            for (int j=0;j<arr.length-1-turn;j++){//also j<=arr.length-2 both are same
                //now sort the array in increasing order
                if(arr[j+1]<arr[j]){
                    //swap the array element
                    int temp=arr[j];//arr[j] is first element
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }

    }

    public static void optimizeBubbleSort(int arr[]){
        for(int turn=0;turn< arr.length-1;turn++){
            boolean isSwap=false;
            //Array is already sorted
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j+1]<arr[j]){
                    //Swapping happens
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwap =true;
                }
            }
            if ( isSwap==false) {
                break;
            }
        }
    }

    public static void printarray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[]={5,4,7,1,8,3,2};
//        bubbleSort(arr);
//        printarray(arr);
        optimizeBubbleSort(arr);
        printarray(arr);

    }
}
