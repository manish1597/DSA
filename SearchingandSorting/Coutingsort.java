package SearchingandSorting;

public class Coutingsort {

    public static void coutingSort(int arr[]){
        int large=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            large=Math.max(large,arr[i]);
        }
        int count[]= new int[large+1];//why +1 because if it zero then we count zero also
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //Sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;

            }
        }
    }
    public static void printarray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        coutingSort(arr);
        printarray(arr);


    }
}
