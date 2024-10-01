public class Doublell {
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
    public static int size;

    public void addfirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        return;
    }
    public int removefirst(){
         if(head==null){
            System.out.println("empty list");
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
    public void addlast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        //newnode.next=null;
        newnode.prev=tail;
        tail=newnode;
        return;
    }
    public void removelast(){
        Node var=head;
        int i=1;
        while(i<size-1){+
            var=var.next;
            i++;
        }
        var.next=null;
        //tail.prev=null;
        tail=var;
        size--;
        return;

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

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;

    }
    public static void removecycle(){
        //detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point
        slow=head; 
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
            
        }
        //removing cycle
        prev.next=null;
        return;
    }
    

    public static void main(String[] args) {
        Doublell dll=new Doublell();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.print();
         System.out.println(dll.size);
        //dll.removefirst();
        dll.addlast(4);
        dll.print();
        System.out.println(dll.size);
        dll.removelast();
        dll.print();
        // System.out.println(dll.size);
        // //dll.reverse();
        // dll.print();
        // System.out.println(isCycle());

        // head=new Node(1);
        // Node temp=new Node(2);
        // head.next=temp;
        // head.next.next=new Node(3);
        // head.next.next.next=temp;
        //System.out.println(isCycle());
        //removecycle();
        //System.out.println(isCycle());



        
        


    }
}



/*class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){                    //remove cycle-both cases including head
        
        if(head==null||head.next==null){
            return;
        }
        Node slow=head;
        Node fast=head;
       
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        
        
        if(slow!=fast)return;
        
        slow=head;
        
        while(slow!=fast){
            
            slow=slow.next;
            fast=fast.next;
            
        }
    
        while(fast.next!=slow){
            
            fast=fast.next;
        }
        fast.next=null;
    }
}*/
