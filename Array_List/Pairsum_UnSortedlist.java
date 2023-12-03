package Array_List;

import java.util.ArrayList;

public class Pairsum_UnSortedlist {
    //Brute force same to classical pair sum code

    //By OPTIMIZE WAY
    public static boolean pairsum2(ArrayList<Integer> list, int target) {

        //find step is to find breaking point in which there sorting logic is violet
        int bp = -1;//this because sorting logic also violet on zero'th index also
        int n=list.size();

        for(int i = 0;i<list.size();i++){
            if(list.get(i)> list.get(i+1)){
                bp=i;//now assign breaking point index to bp and break the loop
                break;
            }
        }
        //now use Two pointer
        int lp=bp+1;//i+1 is smallest element in unsorted list
        int rp=bp;//largest element

//        now use loop
        while (lp !=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                //then go toward largest value by modular Arithmatic
                //for clockwise means right to left is
                lp=(lp+1)%n;
            }
            else {
                //go toward smaller value by left to right rotation
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16 ;

        System.out.println(" in unsorteslist Is pair equal to target (O(n))\n"+pairsum2(list,target));
    }
}
