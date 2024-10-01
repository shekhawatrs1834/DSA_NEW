import java.util.*;
public class QueueStack {
        static class Queue{
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();

        //isEmpty
        public boolean isEmpty(){
            return s1.isEmpty();
        }

        //add                                                    O(n)
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.add(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove                                              O(1)
        public int remove(){
            if(isEmpty()){
                System.out.println("stack underflow");
                return -1;
            }
            return s1.pop();
        }

        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("stack underflow");
            }
            return s1.peek();
        }


    }
    public static void main(String[] args) {
        Queue q=new Queue();                    //we created an object of static class but static class cannot be instantiated so how?
        q.add(1);      //actually we can make objects of nested static class, here queue is nested static class of Queuestack class
        q.add(2);
        q.add(3);
        //q.remove();
        q.add(4);
        System.out.println(q.peek());

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
