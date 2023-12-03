package Array_List;


import java.util.ArrayList;
import java.util.*;

public class Monotonic {

    public static boolean monotonic(ArrayList<Integer> list){
        //First we set both increasing and decreasing true we change we false conditon occure
        boolean increasing=true;
        boolean decreasing=true;
        //set firsr value to prev variable
//        int prev=list.get(0);
        //now start iteration from next index
//        for(int i=1;i<list.size();i++){
//            int curr= list.get(i);
//            //First check weather it increasing order or not try to false
//            if(curr<prev){
//                increasing=false;//it means list is in not in increasing order
//            }
//            //now check weather it is in decreasing order or not
//            if(curr>prev){
//                decreasing=false;
//            }
//            //now assign new value to prev variable
//            prev=curr;
//        }
//        return increasing || decreasing;
        for (int i=0;i<list.size()-1;i++){
            if(list.get(i+1)< list.get(i)){
                increasing=false;
            }
            if(list.get(i+1)> list.get(i)){
                decreasing=false;
            }
        }
        return increasing || decreasing;
    }

    public static boolean MMonotonic(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < A.size() - 1; i++) {
            if (A.get(i) > A.get(i + 1))
                inc = false;
            if (A.get(i) < A.get(i + 1))
                dec = false;
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list1.addAll(Arrays.asList(1,2,2,3,6));
        list2.addAll(Arrays.asList(6,5,4,4,8));
        list3.addAll(Arrays.asList(1,3,2));

        System.out.println("Is Given list is Monotonic?");
        System.out.println(monotonic(list1));
        System.out.println();
        System.out.println();
        System.out.println(MMonotonic(list1));
    }

}
