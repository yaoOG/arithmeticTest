package com.yao.leetcode;

/**
 * @author Daniel:)
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次
 */
public class Main83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
