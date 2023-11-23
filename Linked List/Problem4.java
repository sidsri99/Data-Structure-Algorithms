public class Problem4 {
/**
 * Leet Code: Add Two Numbers
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *  Example 1:
*   Input: l1 = [2,4,3], l2 = [5,6,4]
*   Output: [7,0,8]
*   Explanation: 342 + 465 = 807.
*   Example 2:
*   Input: l1 = [0], l2 = [0]
*   Output: [0]
*   Example 3:
*   Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
*   Output: [8,9,9,9,0,0,0,1]
 */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = null;
        ListNode head = null;
        int value = 0;
        int carry = 0;

        while(l1!=null || l2!=null || carry !=0){
            value = carry;
            if(l1!=null){
                value +=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                value +=l2.val;
                l2 = l2.next;
            }
            
            carry = value / 10;
            value  = value % 10;

            ListNode current = new ListNode(value);
            if(prev == null){
                head = current;
            }else{
                prev.next = current;
            }
            prev = current;

        }
        return head;
    }
    
}
