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
    public ListNode reverseList(ListNode head) {
       ListNode curr = head;
       ListNode prv = null;
       ListNode forward;
       while(curr != null){
forward = curr.next;
curr.next = prv;
prv = curr;
curr = forward;
       }
return prv;
    }
}