
import java.util.*;

public class StackDeque {
    static class Stack{
        Deque<Integer> q=new LinkedList<>();

        //push
        public void push(int data){
            q.addFirst(data);                        //can also use addLast  ,removeLast and getLast respectively
        }

        //pop
        public int pop(){
           return q.removeFirst();                     
        }

        //peek
        public int peek(){
            return q.getFirst();
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
