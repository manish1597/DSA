package Greedy_Algorithm;

import java.util.ArrayList;

public class Activity_Selection_Sorted {
    public static void main(String[] args) {

        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        //sorting on the basis of end time
        //here end time already in sorted
        int maxAct=0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st Activity
        maxAct=1;
        ans.add(0);

        int lastEnd=end[0];
        for(int i=1;i<end.length;i++) {
            if (start[i] >= lastEnd) {
                //Activity Select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];

            }
        }
            System.out.println("max Activity = " +maxAct);
            for(int i=0 ;i<ans.size();i++){
                System.out.print("A"+ans.get(i)+" ");
            }
//            System.out.println();
    }
}
