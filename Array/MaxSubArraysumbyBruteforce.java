package Array;



//TIME COMPLEXITY= O(n^3)
public class MaxSubArraysumbyBruteforce {
    static void Printsubmax(int n[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            int start=i;//2 comes in start
            for(int j=i;j<n.length;j++){
                int end=j;//here 2 comes in end
                currentsum=0;//IMP value will change if we not reset to zero then continuos addition to currentsum
                for(int k=start;k<=end;k++){//we have to make pairs in between start and end
                    //Now we have to print sum of sub pairs
                    currentsum +=n[k];
                }
                System.out.println(currentsum+" ");
                if(maxsum < currentsum) {
                    maxsum=currentsum;
                }

            }
        }
        System.out.println("Max sum ="+maxsum);
    }

    public static void main(String[] args) {
        int n[]={2,4,6,8,10};
        System.out.println("Sums....");
        Printsubmax(n);

    }


}
