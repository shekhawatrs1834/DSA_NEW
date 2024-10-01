import java.util.*;
public class Stackproblems {
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop(); //top element ko store kr liya
        pushAtBottom(s,data); //recursively push the data at the bottom of stack
        s.push(top);  //jo top nikale the wps daldo data push krne k baad

    }
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int i=0;

        while(i<str.length()){     //phle string ko stack mein daldo
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder str1=new StringBuilder("");     //to store reverse string
        while(!s.isEmpty()){
        char top=s.pop();                              //ek ek krke element ko stack se nikalo aur stringbuilder mein daldo
        str1.append(top);
        }
        return str1.toString();                      //convert stringbuilder to string and return
    }

    public static void reverseStack(Stack<Integer> s){       //O(n)
        // if(s.isEmpty()){
        //     return;
        // }
        // int top=s.pop();  //pop the element from the stack
        // reverseStack(s);    //recursively reverse the remaining stack
        // pushAtBottom(s,top);   //after the stack is reversed, push the current top element at bottom
        
        Stack<Integer> s1=new Stack<>();
        while(!s.isEmpty()){
            int top=s.pop();
            s1.push(top);
        }
        

    }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();Stack<Integer> s1=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // pushAtBottom(s,4);
        reverseStack(s1);

        while(!s1.isEmpty()){
            System.out.println(s.pop());
        }

       // System.out.println(reverseString("abc"));
    }
}
