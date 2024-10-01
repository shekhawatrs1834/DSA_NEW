public class Linkedlist {
    public static class Node{          //single node creation
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;             //we are assuming that there is only one node
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
 
    public void addfirst(int data){
        //step1=create a new node
        Node newNode= new Node(data);
        size++;

        if(head==null){   //empty LL
            head=tail=newNode;
            return;
        }
        //step2=newnode's next=head;
        newNode.next=head;                 //linking step

        //step3=head=newnode
        head=newNode;
    }
    public void addlast(int data){
        Node newNode= new Node(data);
        size++;

        if(head==null){   //empty LL
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
         System.out.println();
    }

    public void add(int indx,int data){
        if(indx==0){                       //base case
            addfirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<indx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    public  void removefirst(){
        if(size==0){
            System.out.println("LL is empty");
            return;
        }
        else if(size==1){
            head=tail=null;
            size=0;                     //head and tail becomes null so size become 0 from 1
            return;
        }
        else{
        head=head.next;
        size--;                          //this is basicallyto track size
        return;}
    }

    public void removelast(){
        if(size==0){
            System.out.println("LL is empty");
            return;
        }
        else if(size==1){
            head=tail=null;
            size=0;                     
            return;
        }
        else{
            Node prev=head;
            int i=0;
            while(i<size-2){             //we will go upto 2nd last element to delete last element
                prev=prev.next;
                i++;
            }
            prev.next=null;
            tail=prev;
            size--;
            return;
        }
    }

    public int itrsearch(int key){
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

    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;               //curr value becomes null and prev will be the last term which is our head
    }
    public Node midnode(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;        //slow is my midnode
    }
    public boolean checkPalindrome(){
        if(head==null||head.next==null){
            return true;
        }
        // 1. find midnode
        Node mid=midnode(head);

        // 2. reverse 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev; //right is my head of right side
        Node left=head;

        // 3.compare both linked list
        while(right!=null){
            if(left.data!=right.data){
            return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
        
    }
    public static Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        

        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                temp.next=head1;
                head1=head1.next;

            }else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }

        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }

        return mergedLL.next;
    }

    public static Node mergesort(Node head){

        if(head==null || head.next==null){
            return head;
        }
        //finding mid
        Node mid=getmid(head);
        //dividing
        Node righthead=mid.next;
        mid.next=null;
        Node Newleft=mergesort(head);
        Node Newright=mergesort(righthead);
        return merge(Newleft,Newright);

    }
    public void zigzag(){
        //mid point
        Node mid=getmid(head);

        //reverse
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node righthead=prev;
        Node lefthead=head;

        Node L , R;
        while(righthead!=null && lefthead!=null){
            L=lefthead.next;
            R=righthead.next;
            lefthead.next=righthead;
            righthead.next=L;

            lefthead=L;
            righthead=R;
        }

         
    }
   public static void main(String args[]) {
        Linkedlist LL=new Linkedlist();
        LL.addfirst(2);
        LL.addfirst(1);
        //LL.print();
        LL.addlast(2);
        //LL.addlast(1);
        LL.addfirst(5);
        //LL.add(2, 9);
        LL.print();
       // LL.head=LL.mergesort(LL.head);
       // LL.print();
         LL.zigzag();
         LL.print();
        //System.out.println(LL.checkPalindrome());
      //System.out.println(LL.size);
      //LL.removefirst();
      //LL.removelast();
      //LL.print();
      //System.out.println(LL.size);
      //System.out.println(LL.itrsearch(9));
      //System.out.println(LL.itrsearch(10));
     // LL.reverse();
      //LL.print();


   }     
    
    
}
