import java.util.*;
public class stack exp 1 {

    public static void main(String[] args) {
        stack<integer> stack=new stack<integer>();
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
