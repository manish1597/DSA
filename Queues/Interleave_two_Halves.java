package Queues;

import java.util.*;

public class Interleave_two_Halves {
    public static void interLeave(Queue<Integer> q){
        //This 3 step proccess
       Queue<Integer> firstHalf = new LinkedList<>();
       int size = q.size();
       for (int i=0 ;i<size/2;i++){
           firstHalf.add(q.remove());//step 1

       }

       while (!firstHalf.isEmpty()) {
           q.add(firstHalf.remove());//step 2
           q.add(q.remove());//step 3
       }

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }

    }
}
