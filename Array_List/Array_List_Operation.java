package Array_List;


import java.util.ArrayList;

public class Array_List_Operation {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Add Operation O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        list.add(0,65);

        System.out.println(list);

        // Get operation O(1)

//       int element= list.get(3);
//        System.out.println(element);

        //Remove Operation O(n)

//        list.remove(1);
//        System.out.println(list);

        //Set element at index O(n)
//
//        list.set(1,99);
//        System.out.println(list);

        //contains give true or false O(n)

        System.out.println(list.contains(3));
        System.out.println(list.contains(77));
        System.out.println(list.contains(99));


    }
}
