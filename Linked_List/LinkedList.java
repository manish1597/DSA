package Linked_List;

import java.rmi.UnexpectedException;

public class LinkedList {
    public static class Node {
        //each node of linked list have data and reference variable
        int data;
        Node next;//next is reference variable which refere or connect next node

        //now we create constructor
        public Node(int data) {
            this.data = data;
            this.next = null;//itially it is pointing to null
        }
    }
    //to track the linked list we make head and tail and it is class specific
    // because linked list have only one HEAD and Tail
    public static Node head;
    public static Node tail;
    public static int size;

    //ADDING THE ELEMEMENT

    //add from head or we can say addFirst
    public void addFirst(int data){
//            step1: to create new node by creating object and pass data in it
        Node newNode= new Node(data);
        size++;
        //if our linklist is empty or we can say contain only one node
        if (head==null){
            //our head and tail is same node
            head=tail=newNode;
            return;
        }

        //step2: newNode next = head means new node next point toward my previous created node
        //This is the step where actual linked list happen
        //this is linking step
        newNode.next=head;
        //means this next have address of head no matter this head value is change or not
        //it still point to next node
        //our head now change but still its newNode next point to next node because its adress store

        //step3:Now our head is change so update it our new node is our head
        head=newNode;
    }

    public void addLast(int data){
        //step 1 : create new node
        Node newNode = new Node(data);
        size++;
        //handling special case
        if(head==null){
            head=tail=newNode;
            return;

        }
//        step2: add element at last or linking
        tail.next=newNode;

//        step3: update tail
        tail=newNode;
    }

    //Printing
    void print (){
        //if link list is empty
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        //intialise tempory to iterate our current LL
        Node temp= head;
        //move temp to each node until it is null
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");


    }

    void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        //First we create new node
        Node newNode= new Node(data);
        size++;
        //then create temperary node
        Node temp=head;
        int i=0;//for findind privious idex node
        //Logic is we will find idx-1 node and link that node next to new node
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //After finding previous node i->idx-1 then link the new node
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int value=head.data;
            head=tail=null;//simply we set to null if only one elment is present
            size=0;
            return value;

        }
        int value=head.data;
        head=head.next;//we move our head to next node and garbage collector remove the first element
        size--;
        return value;

    }

    public int removeLast(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        Node prev =head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;//this step help to find previous node

        }
        //Then two operation we have to done for remove the last elemenet
        //first is point prev.next=null and tail = prev;
        int value = tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return value;
    }
    public int linearSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;

        }
        return -1;
    }

    //Recursive Search
    public int helper(Node head,int key){//Helper is actual recursive function where head check at each recursive call
        //Base condition
        if(head==null){
            return -1;//if key not present return -1
        }
        if (head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);//check at time only one value that is head value if found then return 0
        if (idx==-1){//if not found then index value is -1
            return -1;
        }
        return idx+1;//0+1 because head value at every stage is 0 so we have to add 1 for correct value

    }
    public int recSeach(int key){
        return helper(head,key);//it will give index


    }

    public void reverse(){
        //intially our previous that is head point to null value
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            //now current become previous Note we are assigning the value curr to previous so it become new curr
            prev=curr;
            //and next become current
            curr=next;
        }
        //Now current poit to null before current that is previous are new head
        head=prev;
    }

    public void deleteNthfromEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        //If we want to delete head from last means last node from last
        if(sz==n){
            head=head.next;
            return;
        }

        //now we have to find previous node to point next to the current node
        //if sz-n
        int i=1;
        int itoFind=sz-n;
        Node prev=head;
        while(i<itoFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    //Pallindrome
//Slow and fast approach
    public Node findmid(Node head){
        Node slow=head;//it is jump by one
        Node fast=head;//it is jump by two
        //now we move fast so that our slow node is our middle node
        //fast!=null is for even no. of nodes and fast.next!=null for odd no. of nodes
        while(fast!=null &&fast.next!=null){
            slow=slow.next;//jump by +1
            fast =fast.next.next;

        }

        return slow; //here we retur the slow node which is our middle node

    }

    public boolean isPalin(){
        //if LL is empty then it is obivious palindrome
        if (head==null || head.next==null){
            return true;
        }

//        step1:find middle
        Node midNode=findmid(head);

        //step2:reverse the second
        Node prev=null;
        Node curr=midNode;
        Node Next;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr= Next;


        }
        Node right =prev; // so our right previous is head
        Node left =head;
//        step3:check left side and right side is equal or not
        while(right !=null){
            if (left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }

    public  boolean iscyclic(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if (fast==slow){
                return true;//cycle exists
            }
        }
        return false;
    }

    public static void removeCycle(){//static because we want to change as whole
        //step1 :Detect Cycle
        Node slow=head;
        Node fast=head;
        boolean exist=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow){
                exist=true;//means cycle exists
                //if it is exists then we don;t want to move further we set slow to head
                //hence we break the loop
                break;
            }
            if(exist==false){
                //Cycle not exists
                return;
            }

        }
        //if exists then find meeting point

//        step2:find meeting point
        //set slow to head
        slow=head;
        Node prev=null;
        while (slow!=fast){
            //we need node to track the previous node of fast
            prev=fast;
            //Now jump both both slow and fast by one
            slow=slow.next;
            fast=fast.next;

        }

//        step3:last node next point to null
        prev.next=null;
    }

//                            MERGE SORT

    public Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;//we want left half last node as middle point
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;//as mid
    }

    public Node merge(Node head1,Node head2){
        //firt we intialise auxillary Node to point smaller mode
        Node auxi= new Node (-1);
        Node temp=auxi;//here temp is pointing to smaller value element
        //Now compare both left and right
        while(head1!=null && head2!=null){
            //compare left and right
            if(head1.data <= head2.data){
                temp.next=head1;
                head1=head1.next;//head next node
                temp=temp.next;//temo pointing
            }
            else {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        //if left side have 4 node and right side have 2 node then left side node is not sorted
        //hence to deal with this situation we do
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;//head next node
            temp=temp.next;//temo pointing

        }
        while (head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return auxi.next;//because auxi head have -1 value
    }


    public Node mergeSort(Node head){
        //Base case when LL is empty or content only one node then it is already sorted
        if(head==null || head.next==null ){
            return head;
        }

        //find mid
        Node mid=getMid(head);
        //left and right merge sort
        Node rightHead=mid.next;
        mid.next=null;//so that left and right side divided
        Node newLeft=mergeSort(head);
        Node newright=mergeSort(rightHead);
        //Merge
        return merge(newLeft,newright);

    }

    public void zigZag(){
        //find middle as a left half last node
        Node slow=head;
        Node fast=head.next;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        Node mid=slow;
        //now reverse the second half by 3 variable and 4 steps
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;//previous become current
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node Nextl,NextR;//for tracking
        //Alternate merging
        while(left!=null && right!=null){
            Nextl=left.next;
            left.next=right;//left next pointing to right
            NextR=right.next;
            right.next=Nextl;
            //Above steps for merging
            //now update the head how left and right
            left=Nextl;
            right=NextR;

        }
    }


    public static void main(String[] args) {
        LinkedList ll =new LinkedList();
//        ll.addFirst(2);
//        ll.addFirst(1);
//        ll.addLast(3);
//        ll.addLast(4);
//        ll.addMiddle(2,65);
//        ll.addMiddle(4,91);
//        ll.print();
//        System.out.println("After Removing");
////        System.out.println( ll.removeFirst());
//        ll.removeFirst();
//        ll.print();
//        System.out.println("After Removing");
////        ll.removeLast();
//        System.out.println(ll.removeLast());
//        ll.print();
//        System.out.println("The index of key is \n"+ll.linearSearch(91));
//        System.out.println("The index of key is (by recursive) \n"+ll.recSeach(91));
//        System.out.println("The Reverse of Linked List is ");
//        ll.reverse();
//        ll.print();
//        System.out.println("The Size of Linked list is \n"+size);
//        ll.deleteNthfromEnd(3);
//        ll.print();

        //PALLINDROME

//        ll.addLast(1);
//        ll.addLast(2);
//        ll.addLast(2);
//        ll.addLast(3);
//        ll.print();
//        System.out.println("Is this Pallindrome?\n"+ll.isPalin());


        //Check Cyclic or not

//        head =new Node(1);
//        head.next =new Node(4);
//        head.next.next =new Node(7);
//        head.next.next.next =head;
//        System.out.println("Is the Given Linked list is Cyclic?\n"+iscyclic());


        //Remove Cyclic ll

//        head =new Node(1);
//        Node temp =new Node(2);
//        head.next =temp;
//        head.next.next =new Node(3);
//        head.next.next.next =temp;
////        ll.print();
//        System.out.println("Is the Given Linked list is Cyclic?\n"+ll.iscyclic());
//       ll.removeCycle();
//
//        System.out.println("Is the Given Linked list is Cyclic?\n"+ll.iscyclic());


        //MERGE SORT
//        ll.addFirst(1);
//        ll.addFirst(2);
//        ll.addFirst(3);
//        ll.addFirst(4);
//        ll.addFirst(5);
//        ll.print();
//
//        System.out.println("Merge sort(nlogn)");
//        ll.head=ll.mergeSort(ll.head);
//        ll.print();


        //ZIGZAG LINK

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        System.out.println("Zig zag linked list is");
        ll.zigZag();
        ll.print();

    }


}
