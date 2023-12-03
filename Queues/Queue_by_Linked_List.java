package Queues;

public class Queue_by_Linked_List {

    static class Node {
        int data;
        Node next;

        Node(int data ){
            this.data=data;
            this.next=null;

        }
    }

    static class Queue{
        static Node head=null;
        static Node tail=null;



        public static boolean isEmpty(){
            return head == null && tail==null;

        }


        public static void add(int data){
            //addlast in linked list
            Node newNode = new Node(data);
            // if we add first element
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;



        }

        public static int remove(){

            if (isEmpty()){
                System.out.println("Queue is Empty ");
                return -1;

            }
            int result = head.data;
            //if queueu has single element
            if(tail == head){
                tail = head=null;

            }else{
                head=head.next;
            }
            return result;



        }

        public static int peek(){
            if (isEmpty()){
                System.out.println("Queue is Empty ");
                return -1;

            }
            return head.data;

        }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);




            while(!isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }





        }

    }
}
