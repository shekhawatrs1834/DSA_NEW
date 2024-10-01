import java.util.*;
class leetcode {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
    public static void main(String args[]){
        int nums[]={2,4,8,5,3,4,9};
        int val=4;
        System.out.print(removeElement(nums,val));
    }
}
    

    
