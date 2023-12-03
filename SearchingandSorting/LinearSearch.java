package SearchingandSorting;
//TIME COMPLEXITY= O(n)
public class LinearSearch {//Sequential search

    public static void Linearseach(int arr[],int a){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==a){
                System.out.println("Index of "+a+" is "+i);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,7,8,9,12,15};
        int k=9;
        Linearseach(arr,k);
    }
}
//TIME COMPLEXITY OF LINEAR SEARCH IS O(n).