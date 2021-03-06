/*
Time Complexity O(n)
Space Complexity O(1)
*/

public class Solution {
	public ListNode reverse (ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode pre = null;
		ListNode cur = head;
		while (cur != null) {
			ListNode tmp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = tmp;
		}

		return pre;
	}
}

//2nd recursion

public Node reverseLinkedList(Node curr, Node prev) {
	if (curr.next == null) {
		curr.next = prev;
		return curr;
	}else {
		Node temp = reverseLinkedList(curr.next, curr);
		curr.next = prev;
		return temp;
	}
}