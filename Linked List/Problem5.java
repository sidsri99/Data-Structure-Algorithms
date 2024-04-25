/**
	P5: Linked List Cycle
	
	Definition for singly lined list
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
	}
*/	
	class Problem5{
		boolean hasCycle(ListNode head){
			ListNode fast = head;
			ListNode slow = head;
			while(fast != null && fast.next != null){
				fast = fast.next.next;
				slow = slow.next;
				if(fast == slow)return true;
			}
			return false;
		}
	}
	