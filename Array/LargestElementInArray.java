package Array;


public class LargestElementInArray {
    public  int largest(int arr[])
    {

        int max = Integer.MIN_VALUE;// we can not take zero
        //because array also contain zero element
        // it give Integers minimum value i.e-2147483648
        for( int i=0;i<arr.length;i++){
//            if(max<arr[i]){//if max is less than array elements then we update these max varible
//                max=arr[i];
//            }
            max=Math.max(max,arr[i]);
        }
        return max;

    }

    public static void main(String[] args) {
        int arrr[]={21,32,65,98,954,212};
        LargestElementInArray s1= new LargestElementInArray();
        System.out.println("Largest element is \n"+s1.largest(arrr));
    }
}
