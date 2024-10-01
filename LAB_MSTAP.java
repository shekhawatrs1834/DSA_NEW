import java.util.*;
public class LAB_MSTAP {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addfirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        return;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node prev=null;
        Node curr=head;
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

    public static void main(String[] args) {
        LAB_MSTAP dll=new LAB_MSTAP();
        dll.addfirst(4);
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        System.out.print("Before reversing: ");
        dll.print();
        System.out.print("After reversing reversing: ");
        dll.reverse();
        dll.print();
}
}

time complexity of this code