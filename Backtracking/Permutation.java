import java.util.*;

public class Permutation {
    public static void Permutations(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //abcd=ab+d=abd   //removed character that is already selected at ith place
            String Newstr=str.substring(0, i)+str.substring(i+1);
            Permutations(Newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        String ans=" ";
        Permutations(str, ans);
    }
}


class Solution {                                                  //leetcode- on numbers
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finallist=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        permutations(nums,ans,finallist);
        return finallist;
    }
    public void permutations(int nums[],List<Integer> ans,List<List<Integer>> finallist){
        //base case
        if(ans.size()==nums.length){
            finallist.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(ans.contains(nums[i])){    //skip duplicates
                continue;
            }
            ans.add(nums[i]);
            permutations(nums,ans,finallist);
            ans.remove(ans.size()-1);             //removing element
        }
    }
}
