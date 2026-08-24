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
        if (head == null || head.next == null) {
            return null;
        }
        ListNode current=head;
        ListNode fast=head;
        int i=0;
        while(i<n){
            fast=fast.next;
            i++;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast!=null && fast.next!=null){
            current=current.next;
            fast=fast.next;
        }
        if(current.next!=null){
            current.next=current.next.next;
        }
        return head;
    }
}