import java.util.*;
public class Stackds {
    /*static class Stack{          //stack using arraylist
        static ArrayList<Integer> list=new ArrayList<>();         //static lgana jruri h tbhi hum directly use kr paenge list ko jaise list.size()==0
        //isempty function
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(list.isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            if(list.isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }*/

    static class Node{                //stack using linked list
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;                //define top of stack

        //isEmpty
        public static boolean isEmpty(){
            return head==null;
        }

        //push
        public static void push(int data){
            Node newnode=new Node(data);

            if(isEmpty()){
              head=newnode;
              return;  
            }

            newnode.next=head;
            head=newnode;
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top=head.data;
            head=head.next;
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            
            return head.data;
        }
        
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
