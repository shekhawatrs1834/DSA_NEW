public class QueueLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{               
        static Node head=null;
        static Node tail=null;

        // isEmpty function
        public static boolean isEmpty(){                    //O(1)
            return head==null && tail==null;
        }

        //add
        public static void add(int data){                             //O(1)
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }

        //remove
        public static int remove(){                                //O(1)
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result=head.data;
            if(head==tail){
                head=tail=null;
            }else{
                head=head.next;
            }
            return result;
        }

        //peek                                                  //O(1)
        public static int peek(){
             if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
           System.out.println( q.peek());
           q.remove();
        }
    }
}
