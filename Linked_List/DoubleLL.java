package Linked_List;

public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }



    }
    public static Node head;
    public static Node tail;

    public static int size;


    //add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    //Addlast
    public void addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;

    }

    //Remove First
    public int  removeFirst(){
        if(head==null){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;

    }
    //Remove Last

    public int removelast(){
        if(head==null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if (size==1){
            int val=tail.data;
            head=tail=null;
            size--;
            return val;
        }
        int val =tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;

    }

    //Reverse the DoublyLL
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;

        }
        head=prev;
    }


    //print
    public void print(){
        if (head==null){
            System.out.println("LL is empty ");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
//        dll.addFirst(3);
//        dll.addFirst(2);
//        dll.addFirst(1);
//        dll.print();
//        System.out.println(size);
//        dll.removeFirst();
//        dll.print();
//        System.out.println(size);
//        dll.addLast(89);
//        dll.print();
//        System.out.println(size);
//        dll.removelast();
//        System.out.println("After removing last element ");
//        dll.print();
//        System.out.println(size);

        //Reverse
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        System.out.println("size is \n"+size);
        dll.reverse();
        System.out.println("After reversing");
        dll.print();
        System.out.println("size is \n"+size);

    }
}
