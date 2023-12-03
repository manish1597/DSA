package Array_List;


import java.util.ArrayList;
import java.util.*;


public class LonleyElement {

    public static ArrayList<Integer> lonely(ArrayList<Integer> num){
        Collections.sort(num);
        //create list to store all lonely element
        ArrayList<Integer> list= new ArrayList<>();
        //First check Middle element of list by excluding oth and last index element
        for(int i=1;i<num.size()-1;i++){
            //now add lonely element in list whose previous and next element not present in list
            //you have to prove all condition true to add in lonely list
            if(num.get(i-1)+1 < num.get(i) && num.get(i)+1 < num.get(i+1)){//both condition must be true to add into empty list
                list.add(num.get(i));//add ith element which is lonely
            }
        }
        //if list contain only one element then it is itself lonely element
        if(num.size()==1){
            list.add(num.get(0));
        }
        //Now check weather 0Th and last element is empty or not
        if(num.size()>1){
            if(num.get(0)+1<num.get(1)){
                list.add(num.get(0));

            }
            //NOW check last element
            if(num.get(num.size()-2)+1 <num.get(num.size()-1)){
                list.add(num.get(num.size()-1));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        list1.addAll(Arrays.asList(10,6,5,8));
        list1.add(10);
        list1.add(6);
        list1.add(5);
        list1.add(8);
        System.out.println("The Lonely element of given list is ");
        System.out.println(lonely(list1));
    }

}
