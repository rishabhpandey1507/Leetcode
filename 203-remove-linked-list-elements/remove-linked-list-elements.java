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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
          ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prv = dummy;
        while(temp != null){
            
           if(temp.val == val){
            prv.next = temp.next;

           } else{
           prv = temp;
           }
           temp = temp.next;
}  
        return dummy.next;
    }
}