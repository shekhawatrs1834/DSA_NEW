import java.util.*;
public class Problem2 {          //O(n)
    public static void InterleaveQueue(Queue<Integer> q){           //interleave 2 halves of a queue
        Queue<Integer> q1=new LinkedList<>();              //make new queue
        int size=q.size();
        for(int i=0;i<size/2;i++){                  //mistake- directly putting q.size()/2 wont work here as the value of size will be keep 
            q1.add(q.remove());                     //changing so it cant compare effectively
        }
        while(!q1.isEmpty()){
            q.add(q1.remove());
            q.add(q.remove());
        }
    }
    public static void QueueReverse(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        //InterleaveQueue(q);
        QueueReverse(q);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
