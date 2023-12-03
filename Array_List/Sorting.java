package Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(84);
        list.add(67);
        list.add(32);
        list.add(89);
        list.add(55);


        System.out.println("The given list is \n"+list);
        System.out.println("List is Acending order is");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("List is Decending order is");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);


    }
}
