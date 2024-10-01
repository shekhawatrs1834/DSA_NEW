import java.util.*;
public class Stack2Queues {
    static class stack{
       static Queue<Integer> q1=new LinkedList<>();
       static Queue<Integer> q2=new LinkedList<>();

       //IsEmpty
       public static boolean isEmpty(){                        //Basic idea- pushing all data to q2 initially
        return// q1.isEmpty()&& 
        q2.isEmpty();
       }

       //push
       public static void push(int data){              //O(1)
        // if(!q1.isEmpty()){
        //     q1.add(data);
        // }else{
            q2.add(data);
        //}
       }

       //pop
       public static int pop(){                            //O(n)
        if(isEmpty()){
            System.out.println("stack empty");
            return -1;
        }
        int top=-1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top=q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);
            }
        }else{
            while(!q2.isEmpty()){
                top=q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
        return top;
       }

       //peek
       public static int peek(){
        if(isEmpty()){
            System.out.println("stack empty");
            return -1;
        }
        int top=-1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top=q1.remove();
                // if(q1.isEmpty()){
                //     break;
                // }
                q2.add(top);
            }
        }else{
            while(!q2.isEmpty()){
                top=q2.remove();
                // if(q2.isEmpty()){
                //     break;
                // }
                q1.add(top);
            }
        }
        return top;
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
