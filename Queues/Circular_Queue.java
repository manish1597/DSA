package Queues;

public class Circular_Queue {
    static class Queue{
        static int arr[];
        static int rear;
        static int size;
        static int front; //because this time front is changing last time it is zero


        Queue(int n){
            arr= new int[n];
            rear=-1;
            size=n;
            front=-1;
        }

        public static boolean isEmpty(){
            return rear==-1 && front==-1;

        }
        public static boolean isFull(){
            return  (rear+1)%size == front;//Queue is full
        }

        public static void add(int data){
            if(isFull()){//means rear at last index
                System.out.println("Queue is full");
                return;

            }
            //if we add first element then we have to update the first elemeny too
            if(front == -1){
                front =0;
            }

            //now we make rear and add data init
            rear =(rear+1)%size;
            arr[rear]=data;
        }

        public static int remove(){
            // we have to delete the front
            //here we don't have to update the rear we update front
            // now we remove by O(1)
            if (isEmpty()){
                System.out.println("Queue is Empty ");
                return -1;

            }
            int result =arr[front];

            //speacial case if we delete the last element then reset front and last to -1
            if(rear==front){
                rear=front=-1;
            }else {
                front=(front+1)%size;
            }
            return result;

        }

        public static int peek(){
            if (isEmpty()){
                System.out.println("Queue is Empty ");
                return -1;

            }
            return arr[front];

        }

        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.add(1);
            q.add(2);
            q.add(3);
            System.out.println(q.remove());
            q.add(4);
            System.out.println(q.remove());
            q.add(5);




            while(!isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }



        }

    }

}
