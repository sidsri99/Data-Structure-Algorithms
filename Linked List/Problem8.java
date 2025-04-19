/**

  P8: Remove Duplicates from Sorted List
  
  Example 1:
  Input: head = [1,1,2]
  Output: [1,2]
  
  Example 2:
  Input: head = [1,1,2,3,3]
  Output: [1,2,3]

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
class Problem8 {
    public ListNode deleteDuplicates(ListNode head) {
        /*if(head == null || head.next == null){
            return head;
        }
        HashSet<Integer> hs=new HashSet<Integer>();
        ListNode tmp = head,prev = head;
        hs.add(tmp.val);
        tmp = tmp.next;
        while(tmp != null){
            if(hs.contains(tmp.val)){
                prev.next = tmp.next;
            }
            else{
                hs.add(tmp.val);
                prev = prev.next;
            }
            tmp = tmp.next;
        }
        return head;*/
        /* Given that LinkedList is already sorted in ascending order*/
        ListNode tmp = head;
        while(tmp != null){
            ListNode same = tmp.next;
            while(same!=null && same.val == tmp.val){
                tmp.next = same.next;
                same = same.next;
            }
            tmp.next = same;
            tmp = tmp.next;
        }
        return head;
    }
}
