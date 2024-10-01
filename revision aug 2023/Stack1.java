import java.util.*;
public class Stack1 {
   

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        stackpush(stack);
        stackpop(stack);
    }

    static void stackpush(Stack<Integer> stack)
    {
        for(int i = 0; i < 4; i++)
        {
            stack.push(i);
        }
    }
     
    
    static void stackpop(Stack<Integer> stack)
    {
        System.out.println("Pop Operation:");
 
        for(int i = 0; i < 5; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }
 


    
}

    

