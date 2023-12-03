package Array_List;


import java.util.ArrayList;
import java.util.Scanner;

public class FIndMaximumno {

    public static void main(String[] args) {


        int max = Integer.MIN_VALUE;

        ArrayList<Integer> list = new ArrayList<>();

        list.add(84);
        list.add(67);
        list.add(32);
        list.add(89);
        list.add(55);

        for(int i=0;i<list.size();i++){
            if(max<list.get(i)){
                max=list.get(i);
            }
        }

        System.out.println("The Largest element in given list is\n "+max);
    }
}
