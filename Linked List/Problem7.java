/**

	Problem 7 : Palindrom Linked List
	
	Example 1:
	Input: head = [1,2,2,1]
	Output: true
	
	Example 2:
	Input: head = [1,2]
	Output: false
	
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
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null)
            return head;
        
        ListNode newHead = reverse(head.next);
        ListNode headNext = head.next;
        headNext.next = head;
        head.next = null;

        return newHead;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newNode = reverse(slow);
        fast = head;
        slow = newNode;
        while(slow != null){
            if(fast.val != slow.val){
                newNode = reverse(newNode);
                return false;
            }
                
            fast = fast.next;
            slow = slow.next;
        }
        newNode = reverse(newNode);
        return true;
    }
}