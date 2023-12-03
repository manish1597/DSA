package Queues;

import java.util.Queue;
import java.util.LinkedList;;


public class queueusing_jcf {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }



    }
}
