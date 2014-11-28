package com.leetcode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * @author ZMC
 */
public class RemoveDuplicates {

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode prev = head;
		ListNode p = head.next;
		while (p != null) {
			if (p.val == prev.val) {
				prev.next = p.next;
				p = p.next;
			} else {
				prev = p;
				p = p.next;
			}
		}
		return head;
	}

}
