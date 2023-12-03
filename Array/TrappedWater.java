package Array;

//TIME COMPLEXITY=O(n)
public class TrappedWater {
    public static int Trap(int[] height){
        int n= height.length;
        //Calculate left max Boundary -Array
        int[] leftmax =new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);//leftmax[i-1] this because we have to calculate check left most bars
        }
        //Calculate Right max Boundary -Array
        int[] rightmax =new int[n];
        rightmax[n-1]=height[n-1];
        for (int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        //Loop
        int trapwater=0;
        for(int i=0;i<n;i++){
            //calculate water_level=min(leftmaxboundary,rigthmaxboundary)
            int water_level;
            water_level=Math.min(leftmax[i],rightmax[i]);
            //Trapped water+=waterlavel -height[i]
            trapwater+=water_level-height[i];
        }
        return trapwater;
    }

    public static void main(String[] args) {
        int[] height ={4,2,0,6,3,2,5};
        int[] h={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] h1={4, 2, 0, 3, 2, 5};
        System.out.println("The Total amount of trap water is\n"+Trap(h1));
    }
}
