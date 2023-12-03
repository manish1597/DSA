package Array_List;

import java.util.ArrayList;

public class SwapElement {
    public static void swap(ArrayList<Integer> list ,int idx1,int idx2){
        //swap by using temp variable
        int temp= list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(84);
        list.add(67);
        list.add(32);
        list.add(89);
        list.add(55);

        int idx1=1;
        int idx2=4;
        System.out.println("The given list is \n"+list);
        System.out.println("List After swap is by idx1 to idx4 is");
        swap(list,idx1,idx2);
        System.out.println(list);
    }
}
