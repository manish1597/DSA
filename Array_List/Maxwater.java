package Array_List;


import java.util.ArrayList;

public class Maxwater {
    public static int water(ArrayList<Integer> height){
        //First create a global variable to compare with current water level
        int maxwater=0;
        //now by using nested loop we get indexes
        for(int i=0;i< height.size();i++){
            for(int j=1;j< height.size();j++){
                //first we have to find minimum height between two lines so condition is water level is
                // not tilted so we take minimum height between two lines
                int minheight=Math.min(height.get(i),height.get(j));
                // now find width is the difference between two indexes
                int width=j-i;
                int waterlevel=minheight*width;
                //now we have to find maximum water between two lines
                maxwater=Math.max(waterlevel,maxwater);

            }
        }
        return maxwater;
    }

    public static int water_optimize(ArrayList<Integer> height){
        //first crete global variable to compare
        int max=0;
        //2 Pointer Approach
        //left pointer for leftmost line and right pointer for right most line
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            //first calculate height of two line which minumum between two
            int heights=Math.min(height.get(lp),height.get(rp));
            //now widhth is idex diffrence bitween two lines
            int width=rp-lp;
            int waterlevel=heights*width;
            max=Math.max(waterlevel,max);

            //Now update lp and rp always move low height line if we move big height line then we get less
            if(lp<rp){
                lp++;

            }
            else {
                rp--;
            }

        }
        return max;
    }


    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);
        System.out.println("The maximum water between TWO lines is (O(n^2))\n"+water(height));
        System.out.println("The maximum water between TWO lines by Two pointer Method is (O(n)");
        System.out.println(water_optimize(height));
    }

}
