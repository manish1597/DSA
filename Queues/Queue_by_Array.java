package Queues;

public class Queue_by_Array {
    static class Queue{
        static int arr[];
        static int rear;
        static int size;

        Queue(int n){
            arr= new int[n];
            rear=-1;
            size=n;
        }

        public static boolean isEmpty(){
            return rear==-1;

        }

        public static void add(int data){
            if(rear==size-1){//means rear at last index
                System.out.println("Queue is full");
                return;

            }
            //now we make rear and add data init
            rear =rear+1;
            arr[rear]=data;
        }

        public static int remove(){
            if (isEmpty()){
                System.out.println("Queue is Empty ");
                return -1;

            }
            int front =arr[0];
            //Now this loop is removing operation we simply shift index right hand side to left hand side
            // and remove the front index value
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;

        }

        public static int peek(){
            if (isEmpty()){
                System.out.println("Queue is Empty ");
                return -1;

            }
            return arr[0];

        }

        public static void main(String[] args) {
            Queue q = new Queue(6);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(78);
            System.out.println("The size of Queue is "+ size);

            while(!isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
            q.remove();


        }

    }
}
