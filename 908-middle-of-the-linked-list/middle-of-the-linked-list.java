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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
count++;
temp = temp.next;
        }
        ListNode tempp = head;
        for(int i = 0; i < count; i++){
            if(i == count/2){
                
                head = tempp;
            }
            tempp = tempp.next;
        }
        return head;
    }
}