package Stack;

import java.util.Stack;

public class Max_Area_Histogram {
    public static void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void maxArea(int arr[]){
//        height is array element itself
        // and width is next left&right smallest element
        //we create two array to keep next left and right smallest element
        Stack<Integer> s= new Stack<>();
        int maxArea=0;
        int[] nls= new int[arr.length];
        int[] nrs= new int[arr.length];
        //first we find out next smaller element right
        for(int i=arr.length-1;i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nrs[i]=arr.length;

            }
            else {
                nrs[i]=s.peek();//we want index while calculating width
            }

            s.push(i);


        }
        //next smaller left
        for(int i=0;i< arr.length;i++){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nls[i]=-1;

            }
            else {
                nls[i]=s.peek();//we want index while calculating width
            }
            s.push(i);
        }

        // now we calculate Area = height * widht
        //width=j-i-1
        for(int i=0;i<arr.length;i++){
            int  currArea=arr[i]*(nrs[i]-nls[i]-1);
            maxArea=Math.max(currArea,maxArea);
        }
        System.out.println("the maximum area of histogram is\n"+maxArea);
    }
    public static void main(String[] args) {


        int arr[]={2,1,5,6,2,3};//height of histogram
        maxArea(arr);
    }
}
