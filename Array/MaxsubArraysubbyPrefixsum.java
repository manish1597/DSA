package Array;



public class MaxsubArraysubbyPrefixsum {
    static void Printsubmax(int n[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;

        int prefix[]=new int[n.length];
        prefix[0]=n[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+n[i];
        }
        for(int i=0;i<n.length;i++){
            int start=i;//2 comes in start
            for(int j=i;j<n.length;j++){
                int end=j;//here 2 comes in end
                currentsum=start==0?prefix[end] : prefix[end]-prefix[start-1];//IMP WHY THIS tart==0?prefix[end] beacuse end=0
                if(maxsum < currentsum) {
                    maxsum=currentsum;
                }

            }
        }
        System.out.println("Max sum ="+maxsum);
    }

    public static void main(String[] args) {
        int n[]={2,4,6,8,10};
        int pre[]={2,4,6,8,10};
        pre[0]=n[0];
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
        for(int i=1;i< pre.length;i++){
            pre[i]=pre[i-1]+n[i];

        }
        System.out.println("\nThe prefix sum array is ");
        for(int j=0;j< pre.length;j++){
            System.out.print(pre[j]+" ");
        }
        System.out.println("\nso we can apply =  currentsum=start==0?prefix[end] : prefix[end]-prefix[start-1];"+"\n we get");
        Printsubmax(n);

    }

}
