public class leetcode & dsa {

   // Merge Two Sorted Lists

    
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode mergedlist=new ListNode();
//         ListNode temp1=list1;
//         ListNode temp2=list2;
//         ListNode current=mergedlist;

//         while(temp1!=null && temp2!=null){
//             if(temp1.val<temp2.val){
//                 current.next=temp1;
//                 temp1=temp1.next;
//             }else{
//                 current.next=temp2;
//                 temp2=temp2.next;
//             }
//             current=current.next;
//         }

//         if(temp1!=null){
//             current.next=temp1;
//         }else{
//             current.next=temp2;
//         }

//         return mergedlist.next;
          
    
// }



/*Collections.sort(arr);
Collections.sort(brr);

List<Integer> missing= new ArrayList<>();

int i=0;
int j=0;

while(i<arr.size()&&j<brr.size()){
     if(arr.get(i).equals(brr.get(j))){
          i++;                                    //hackerrank= missing value in the array
          j++;
     }else{
          missing.add(brr.get(j));
     }
}
while(j<brr.size()){
     missing.add(brr.get(j));
}

return missing;*/



//is array monotone or not
// class Solution {
//     public boolean isMonotonic(int[] nums) {
//       // boolean ismonotone=false;
//        int i=0;
//        while(i<nums.length-1 && nums[i]<=nums[i+1] ){
//            i++;
           
//        }
//        //ismonotone= true;

//        if (i == nums.length - 1) {
//            return true;
//         }
       
//        i=0;
//        while(i<nums.length-1 && nums[i]>=nums[i+1] ){
//            i++;
          
//        }
//         //ismonotone= true;
       

//     return i==nums.length-1;
//     }
// }


//intersection point of 2 linkd list

//approach - 01

// public class Solution {
//     public int length(ListNode head) {
//         int len = 0;
//         while (head != null) {
//             len++;
//             head = head.next;
//         }
//         return len;
//     }

//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if (headA == null || headB == null) {
//             return null;
//         }

//         // Step 1
//         int lenA = length(headA), lenB = length(headB);

//         // Step 2
//         if (lenA > lenB) {
//             while (lenA > lenB) {
//                 headA = headA.next;
//                 lenA--;
//             }
//         } else if (lenA < lenB) {
//             while (lenA < lenB) {
//                 headB = headB.next;
//                 lenB--;
//             }
//         }

//         // Step 3
//         while (headA != null && headB != null) {
//             if (headA == headB) {
//                 return headA;
//             }
//             headA = headA.next;
//             headB = headB.next;
//         }
//         return null;
//     }
// }


//approach -2
// public class Solution {
//     public int length(ListNode head) {
//         int len = 0;
//         while (head != null) {
//             len++;
//             head = head.next;
//         }
//         return len;
//     }

//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         // Getting the tail
//         ListNode tail = headA;
//         while (tail.next != null) {
//             tail = tail.next;
//         }

//         // Creating a loop
//         tail.next = headA;

//         // Detecting and finding the intersection
//         ListNode fast = headB, slow = headB;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if (slow == fast) {
//                 slow = headB;
//                 while (slow != fast) {
//                     slow = slow.next;
//                     fast = fast.next;
//                 }
//                 // Undoing the loop
//                 tail.next = null;
//                 return slow;
//             }
//         }

//         tail.next = null;
//         return null;
//     }
// }


// class Solution {                                                        //remove linked list elements
//     public ListNode removeElements(ListNode head, int val) {
//         ListNode temp = head;
//         ListNode prev = null;

//         while (temp != null) {
//             if (temp.val == val) {
//                 if (prev != null) {
//                     prev.next = temp.next;
//                 } else {
//                     // If prev is null, it means we're at the head of the list
//                     head = temp.next;
//                 }
//             } else {
//                 // Only update prev when temp.val != val
//                 prev = temp;
//             }
//             temp = temp.next;
//         }
//         return head;
//     }
// }


// public class Solution {                             //no. of 1 bits
                                                            //In the original code, n = n >> 1; uses the arithmetic right shift (>>). This fills the leftmost bits with the sign bit
                                                            // (0 for positive, 1 for negative). It may not give the correct result when treating n as an unsigned value.
                                                            // In the updated code, n = n >>> 1; uses the logical right shift (>>>). This fills the leftmost bits with zeros, 
                                                            // regardless of the sign of the number. It ensures that the count of set bits is not affected by the sign bit.
//     // you need to treat n as an unsigned value
//     public int hammingWeight(int n) {
//         int count=0;
//         while(n!=0){
//             if((n & 1)==1){
//                 count++;
//             }
//             n=n>>>1;
//         }
//         return count;
//     }
// }




}
