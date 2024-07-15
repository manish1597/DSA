package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection_Unsorted {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {6, 2, 4, 7, 9, 9};


        // Sorting with help of 2D Array
        int activities[][] = new int[start.length][3]; // 3 columns: 1st for index, 2nd for start, 3rd for end

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Lambda function -> sorting 3rd column with the help of comparator
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));

        // sorting on the basis of end time
        int maxAct = 1;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        ans.add(activities[0][0]);

        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                // Activity Select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("max Activity = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
