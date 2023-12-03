package Queues;
import java.util.*;
public class Double_Ended_Queue {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);//1
        d.addFirst(2);//2,1
        d.addLast(3);//2,1,3
        d.addLast(4);//2,1,3,4
//        d.removeFirst();
//        d.removeLast();~

        System.out.print(d);
        System.out.println("\nThe first element is "+d.getFirst());
        System.out.println("The Lasr element is "+d.getLast());


    }
}
