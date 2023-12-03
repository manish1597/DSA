package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element {
    public static void rightGreater(int arr[],int nxtGreater[]){
        //we have to find right greater hence we store values in stack from right side

        Stack<Integer> s = new Stack<>();
        for(int i= arr.length-1;i>=0;i--){
            //we have to find right side greater hence we remove all right side smaller values
            //we pop element untils stack is not empty and stack.peek<=element
            //We have to compare the values have we store the index of array in stack
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop(); // we remove all smaller element but if we we fing greater element then loop will break
                //or if it is not present in array then stack is empty that means greater element not present in array

            }
            if (s.isEmpty()){
                nxtGreater[i]=-1;
            }
            else {
                nxtGreater[i]=arr[s.peek()];//next greater element will store in array
            }
            //Finally we push this current value into stack

            s.push(i);//we store the indices in stack

        }
        printArray(arr);
        System.out.println("The Right side greater element above array is ");
        printArray(nxtGreater);
        System.out.println();

    }

    public static void leftsideGreater(int arr[],int nxt[]){
        Stack<Integer> s = new Stack<>();
        for(int i= 0;i<arr.length;i++){
            while (!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nxt[i]=-1;
            }
            else {
                nxt[i]=arr[s.peek()];
            }
            s.push(i);

        }
        printArray(arr);
        System.out.println("The Left side greater element above array is ");
        printArray(nxt);
        System.out.println();

    }
    public static void leftsideSmaller(int arr[],int nxt[]){
        Stack<Integer> s = new Stack<>();
        for(int i= 0;i<arr.length;i++){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nxt[i]=-1;
            }
            else {
                nxt[i]=arr[s.peek()];
            }
            s.push(i);

        }
        printArray(arr);
        System.out.println("The Left side Smaller element above array is ");
        printArray(nxt);
        System.out.println();

    }
    public static void rightsidesmaller(int arr[],int nxt[]){
        //we have to find right smaller hence we store values in stack from right side
        Stack<Integer> s = new Stack<>();
        for(int i= arr.length-1;i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nxt[i]=-1;
            }
            else {
                nxt[i]=arr[s.peek()];//next greater element will store in array
            }
            //Finally we push this current value into stack

            s.push(i);//we store the indices in stack

        }
        printArray(arr);
        System.out.println("The Right side smaller element above array is ");
        printArray(nxt);
        System.out.println();

    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int nxt[]= new int[arr.length];
        rightGreater(arr,nxt);
        leftsideGreater(arr,nxt);
        leftsideSmaller(arr,nxt);
        rightsidesmaller(arr,nxt);

        //We solve this question with O(N) complexity by using stack




    }
}
