public class Linkedlist practice {
    
    //intersection point  of 2 linked list  - leetcode
    public int length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        // Step 1
        int lenA = length(headA), lenB = length(headB);

        // Step 2
        if (lenA > lenB) {
            while (lenA > lenB) {
                headA = headA.next;
                lenA--;
            }
        } else if (lenA < lenB) {
            while (lenA < lenB) {
                headB = headB.next;
                lenB--;
            }
        }

        // Step 3
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}


