package practice.Linkedlist.FloydFastSlow;

import practice.Linkedlist.ListNode;

public class deleteMiddle {
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
    // Brute Force -> O(n) Time Limit Exceeded
     public ListNode deleteMiddle1(ListNode head) {
         if (head == null || head.next == null)  return null;

         int count = 0;
         ListNode temp = head;
         while (temp != null){
             ++count;
             temp = temp.next;
         }
         int mid = count/2;
         temp = head;
         for (int i=0; i<mid-1; i++){
             temp = temp.next;
         }
         temp.next = temp.next.next;
         return temp;
     }

    // Optimal Floyd Fast and Slow pointer
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)  return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;

        return head;
    }

}
