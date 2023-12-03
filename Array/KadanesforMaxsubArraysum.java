package Array;


//TIME COMPLEXITY =O(n)
//kadanes states if current sum is negative take zero

public class KadanesforMaxsubArraysum {
    public static void kadanes(int n[]){
        int max_sum=Integer.MIN_VALUE;
        int current_sum=0;

        for(int i=0;i<n.length;i++){
            current_sum=current_sum+n[i];
            if(current_sum < 0){
                current_sum = 0;
            }
            max_sum=Math.max(current_sum, max_sum);// write this statement in loop
        }

        System.out.println("Maximum sum of sub Array by kadane Algorithm is\n"+max_sum);

    }
    public static void main(String[] args) {
        int n []={-2,-3,4,-1,-2,1,5,-3};
        int na[]={2,4,6,8,10};
//        kadanes(n);
        kadanes(na);

    }
}
