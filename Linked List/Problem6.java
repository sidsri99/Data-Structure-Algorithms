/**
Problem 6: 
Remove Nth Node From End of List

Example 1: 
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        if(n == count)return head.next;
        count = count-n;
        temp = head;
        while(--count>0)
            temp = temp.next;
        temp.next = temp.next.next;
        return head;
    }
	
	public ListNode removeNthFromEnd_Better(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        if(n == count)return head.next;
        count = count-n;
        temp = head;
        while(--count>0)
            temp = temp.next;
        temp.next = temp.next.next;
        return head;
    }
}
