import java.util.*;
public class QueueUsingArray {

        static class Queue{               //we will make a class of queue
        static int arr[];                 //in static class all the variables and functions should be static
        static int size;
        static int rear;

        Queue(int n){                    //make a constructor to initialize the object 
            arr=new int[n];
            size=n;
            rear=-1;
        }

        // isEmpty function
        public static boolean isEmpty(){                    //O(1)
            return rear==-1;
        }

        //add
        public static void add(int data){                             //O(1)
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        //remove
        public static int remove(){                                //O(n)
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return arr[0];
        }

        //peek                                                  //O(1)
        public static int peek(){
             if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
           System.out.println( q.peek());
           q.remove();
        }
    }
}
