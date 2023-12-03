package Linked_List;

public class CircularLL {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void add(int data){
        Node newNode =new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        if(temp!=null){
            do {
                System.out.print(temp.data+"->");
                temp=temp.next;

            }while (temp!=head);//we cover only one rotation

        }
        System.out.println("Head");
    }

    public void remove(int val){
        Node temp=head;
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }

        //if value present at head
        if(temp.data==val){
            head=head.next;
            tail.next=head;
            return;
        }
        //if it is present in beetween
        do {
            Node n=temp.next;
            if (n.data==val){
                temp.next=n.next;
                break;
            }
            temp=temp.next;
        }while (temp!=head);


    }

    public static void main(String[] args) {
        CircularLL cll =new CircularLL();
        cll.add(232);
        cll.add(45);
        cll.add(99);
        cll.add(78);
        cll.print();
        cll.remove(99);
        cll.print();

    }
}
