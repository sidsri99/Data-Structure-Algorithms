/*
    Merge Two Sorted Lists

    Example : 
    Input: list1 = [1,2,4], list2 = [1,3,4]
    Output: [1,1,2,3,4,4]

    Example :
    Input: list1 = [], list2 = []
    Output: []

    Example :
    Input: list1 = [], list2 = [0]
    Output: [0]

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
class Problem1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans=new ListNode(0,null);
        ListNode head = ans;
        if(list1 == null && list2 == null){
            return null;
        }
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                ans.next = list1;
                list1 = list1.next;
            }
            else{
                ans.next = list2;
                list2 = list2.next;
            }
            ans = ans.next;
        }
        if(list1 == null && list2 !=null){
            ans.next = list2;
        }
        else if(list1 != null && list2 == null){
            ans.next = list1;
        }
        return head.next;
    }
}

/*
    Output: 
*/