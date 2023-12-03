package Array_List;

import java.util.ArrayList;

public class Multidimension_List {
    public static void main(String[] args) {
        //First we create mainlist in which multiple lists are stored
        ArrayList<ArrayList<Integer>> mainlist= new ArrayList<>();
        // mow create list which you wann store in mainlist
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        // now add element in lists
        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*4);
        }
        //Now add this lists in main list
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);
        System.out.println("The matrix form on given arraylist is");
        //by using nested list
        //first iterate whole mainlist elments
        for(int i=0;i<mainlist.size();i++){
            //now create new arralist and store all mainlist value in that list
            ArrayList<Integer> currlist= mainlist.get(i);
            //now iterate the currlist and show elments in matrix form
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
    }
}
