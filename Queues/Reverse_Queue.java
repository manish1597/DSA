package Queues;

import java.util.LinkedList;
import java.util.*;

public class Reverse_Queue {
    public static void reverse(Queue<Integer> q){
        //first remove from queue and push to stack
      Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        //now remove from stack and re add to queue
        while (!s.isEmpty()){
            q.add(s.pop());
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

        reverse(q);


        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }

    }
}
