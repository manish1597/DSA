package Array_List;

import java.util.ArrayList;

public class PairSum1 {
    public static boolean pairsum1(ArrayList<Integer> list,int target){
        //write classical pair find code
        for(int i=0;i<list.size();i++){
            for(int j=1;j<list.size();j++){
                if(list.get(i)+ list.get(j)==target){
                    return true;
                }

            }
        }
        return false;
    }

    public static boolean optimizepairsum1(ArrayList<Integer> list ,int target){
        //By Pointer Method
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if (list.get(lp)+list.get(rp)==target){
                return true;
            }
            if (list.get(lp)+list.get(rp)<target){
                lp++;//go toward bigger value

            }
            else {
                rp--;//go toward lower value
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target =5;
        System.out.println("is list elements pair equal to target element(O(n^2)) \n"+pairsum1(list,target));
        System.out.println("is list elements pair equal to target element(O(n)) \n"+optimizepairsum1(list,target));

    }
}


