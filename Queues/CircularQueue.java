public class CircularQueue {
    static class Queue{               //we will make a class of queue
        static int arr[];                 //in static class all the variables and functions should be static
        static int size;
        static int rear;
        static int front;

        Queue(int n){                    //make a constructor to initialize the object 
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }

        // isEmpty function
        public static boolean isEmpty(){                    //O(1)
            return rear==-1 && front==-1;
        }
        //isFull
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        //add
        public static void add(int data){                             //O(1)
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){                          //when we are adding 1st element toh front ko vi 0 pr lana hoga , rear to aa  hi jaega neeche wle step se  
                front=0;
            }
            rear=(rear+1)%size; 
            arr[rear]=data;
        }

        //remove
        public static int remove(){                                //O(1)
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result=arr[front];
            if(front==rear){                    //when only a single element is left inside queue
                front=rear=-1;
            }else{
             front =(front+1)%size;
            }
            return result;
        }

        //peek                                                  //O(1)
        public static int peek(){
             if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()){
           System.out.println( q.peek());
           q.remove();
        }
    }
}
