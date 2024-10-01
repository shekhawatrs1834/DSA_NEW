public class Linkedlist1 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
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
            head=newnode;
         }

        public void addlast(int data){
        Node newnode=new Node(data);
        size++;
            if(head==null){
                head=tail=newnode;
                return;
            } 
            newnode.next=tail;
            tail=newnode;
        }

        public void print(){
            if(head==null){
                System.out.println("empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+"-->");
                temp=temp.next;
            }
            

        }

        public void add(int indx,int data){
            if(indx==0){
                addfirst(data);
                return;
            }
            Node newnode=new Node(data);
            size++;
            int i=0;
            Node temp=head;
            while(i<indx-1){
                i++;
                temp=temp.next;
            }

            newnode.next=temp.next;
            temp.next=newnode;


        }
        public void removefirst(){
            if(size==0){
                System.out.println("empty");
                //return Integer.MAX_VALUE;0
            }
            if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                //return val;
            }
            int val=head.data;
            head=head.next;
            size--;
            //return val;

        }
        public void removelast(){
            int i=0;
            Node prev=head;
            if(size==0){
                System.out.println("empty");
                
            }
            if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                
            }
            while(i<size-2){
                prev=prev.next;
                i++;
            }
            prev.next=null;
            tail=prev;
            size--;
          
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
            prev=head;
        }
        public void deleteNthfromend(int n){
            int sz=0;
            Node temp=head;
            while(temp!=null){
                head=head.next;
                sz++;
            }
            if(n==sz){
                head=head.next;
                return;
            }
            int i=1;
            Node prev=head;
            int iTofind=sz-n;
            while(i<iTofind){
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return;

        }
    
    public static void main(String[] args) {
        Linkedlist LL=new Linkedlist();
        LL.addfirst(2);
        LL.addfirst(1);
        LL.addlast(3);
        LL.addlast(6);
        LL.add(1, 4);
        //LL.removefirst();
        //LL.removelast();
        //System.out.println(LL.size);
        //System.out.println(LL.itrsearch(2));
        //LL.reverse();
        LL.print();
        //LL.deleteNthfromend(3);
        //LL.print();
    }
}


