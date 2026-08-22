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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode temp = head;
        ListNode slow = head.next;
        ListNode fast = head.next;

        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        while(temp.next != slow){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        return head;
        
    }
}