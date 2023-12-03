package Queues;
import  java.util.*;

public class Stack_using_2_Queue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            //we have to check both
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            //Now add element to non-Empty Queue this is First step
            //no matter which queue is empty add element to these queue
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);

            }

        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;

            }
            int top = -1;
            //we pop element until we have reach to last element and store last element to top and remaining push to q2
            //Now we have two case for q1 and q2 if we deal with which queue is not empty
            if (!q1.isEmpty()) {
                //until q1 is empty we store q1 elememt to top
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                        //so that last element is store to top

                    }
                    //add element to q2 and last element store in top
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }


            }
            return top;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;

            }
            int top = -1;
            if (!q1.isEmpty()) {

                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();

                    q1.add(top);
                }


            }

            return top;

        }


    }

    public static void main(String[] args) {
        Stack s  = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}

