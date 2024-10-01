import java.util.*;
public class Problem1 {
    public static void FirstNonRepeating(String str){                     //to find firstnonrepeating character
        int freq[]=new int[26];                                       //a to z elements will be stored from 0 to 25 index respectively
        Queue<Character> q=new LinkedList<>();

        for(int i=0;i<str.length();i++){                         //tc-O(n)
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a']>1){                 //q.peek()-will give respective character in queue & -'a' will give index of that charcter in freq array
                q.remove();
            }

            // if(q.isEmpty()){
            //     System.out.print(-1+" ");
            // }else{
            //     System.out.print(q.peek()+" ");
            // }
        }
        System.out.println(q.peek());
    }
    public static void main(String[] args) {
        String str="aabccxb";
        FirstNonRepeating(str);
    }
}
