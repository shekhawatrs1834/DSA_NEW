import java.util.*;

public class SubsetProblem {                                                 // for strings
    public static void Subsets(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //recursion
        //yes condition
        Subsets(str, ans+str.charAt(i), i+1);
        //no condtion
        Subsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        String ans="";
        Subsets(str,ans,0);
    }
    
}

                                                                                     //for array={1,2,3}
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> finallist=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Subsets(nums,ans,finallist,0);
        return finallist;
        
    }
    public void Subsets(int nums[],List<Integer> ans,List<List<Integer>> finallist,int i){
        //base case
        if(i==nums.length){
            finallist.add(new ArrayList<>(ans));
            return;
        }
        //recursion
        ans.add(nums[i]);
        // for yes condition
        Subsets(nums,ans,finallist,i+1);
        ans.remove(ans.size()-1);  //backtracking

        //for no condition
        Subsets(nums,ans,finallist,i+1);
    }
}

                                                                                        // for duplicates
class Solution1 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> finallist=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);        //necessary in case of duplicates 
        Subsets(nums,ans,finallist,0);
        return finallist;  
    }
    public void Subsets(int nums[],List<Integer> ans,List<List<Integer>> finallist,int i){
        //base case
        if(i==nums.length){
            if(!finallist.contains(new ArrayList<>(ans))){        //for duplicates
            finallist.add(new ArrayList<>(ans));
            }
            return;
        }
        //recursion
        ans.add(nums[i]);
        // for yes condition
        Subsets(nums,ans,finallist,i+1);
        ans.remove(ans.size()-1);  //backtracking

        //for no condition
        Subsets(nums,ans,finallist,i+1);
    }
}

