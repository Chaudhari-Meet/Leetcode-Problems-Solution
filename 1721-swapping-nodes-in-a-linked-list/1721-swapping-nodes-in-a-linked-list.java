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
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> arr = new ArrayList<>();
        ListNode temp1 = head;
        while(temp1!=null){
            arr.add(temp1.val);
            temp1=temp1.next;
        }
        int size = arr.size();
        int temp = arr.get(k-1);
        arr.set(k-1,arr.get(size-k));
        arr.set(size-k,temp);
        ListNode result = new ListNode(0,head);
        ListNode current = head; 
        for (int i = 0; i < size; i++) {
            if (current != null) {
                current.val = arr.get(i);
                current = current.next;
            } else {
                break;
            }
        }
        return result.next;
    }
}