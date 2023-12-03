package Divide_and_Conquer;

public class Sorted_and_Rotatated_Array {
    public static int search(int arr[],int si,int ei,int k)  {
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(k==arr[mid]){
            return mid;
        }
        //If Mid lie on Line1
        if(arr[si]<=arr[mid]){
//            case a check left side of line1
            if ( k<=arr[mid] &&  arr[si]<=k){
                return search(arr, si, mid-1, k);
            }
            else {
//                case b check right side of line1
                return search(arr, mid+1, ei, k);
            }
        }
        else {
            //case c check right side of line 2
            if(k>=arr[mid]&& k<=arr[ei]){
                return search(arr, mid+1, ei, k);

            }
            else {//check left side of line 2
                return search(arr, si, mid-1, k);

            }
        }
    }



    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int key =0;


        int keyIndex=search(arr,0,arr.length-1,key);
        System.out.println("The index of "+key+" is\n"+keyIndex);
    }
}
