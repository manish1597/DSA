package Array;


import java.util.Scanner;

public class SmallestElementArray {
    public static  int smallest(int arr[])
    {

        int min = Integer.MAX_VALUE;// we can not take zero
        //because array also contain zero element
        // it give Integers maximum value value
        for( int i=0;i<arr.length;i++){
            if(min>arr[i]){//if max is less than array elements then we update these max varible
                min=arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int k= sc.nextInt();
        int arr[]= new int[k];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The smallest element of array is \n"+smallest(arr));


    }
}

