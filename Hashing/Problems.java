import java.util.*;
public class Problems {
    public static boolean ValidAnagram(String s,String t){
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int i=0;i<s.length();i++){                    //first we will store the characters and their frequency in hashmap
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<t.length();i++){                  //then according to string 2 we will keep removing the characters from hashmap and at the end check if the hashmap is empty 
            char ch=t.charAt(i);                         //if it is empty then true else false which means it is left with some extra characters in string 2
            if(hm.get(ch)!=null){
                if(hm.get(ch)==1){
                    hm.remove(ch);
                }else{
                    hm.put(ch,hm.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return hm.isEmpty();
    }

    public static int majorityElement(int[] nums) {
        //     //boyer moore majority vote algo
        //  int count=0;
        //  int majority=0;
    
        //  for(int i=0;i<nums.length;i++){
        //      if(count==0){
        //          majority=nums[i];
        //          count++;
        //      }else if(majority==nums[i]){  
        //          count++;
        //      }else{
        //          count--;
        //      }
        //  }
        //  return majority;
    
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            // if(hm.containsKey(nums[i])){
            //     hm.put(nums[i],hm.get(nums[i])+1);
            // }else{
            //     hm.put(nums[i],1);
            // }
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        for(Integer key:hm.keySet()){
            if(hm.get(key)>nums.length/2){
                return key;
            }
        }
        return 0;
        }
    public static void main(String[] args) {
        String s="knee";
        String t="keen";
        //System.out.println(ValidAnagram(s, t));

        int nums[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
