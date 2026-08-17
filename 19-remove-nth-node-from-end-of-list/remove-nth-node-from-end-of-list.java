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
        ListNode fast = head;
        ListNode slow = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prv = dummy;

        for(int i = 1; i < n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
      prv = slow;      
slow = slow.next;
fast = fast.next;

        }
prv.next = slow.next;
return dummy.next;
    }

}