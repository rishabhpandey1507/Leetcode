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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            s.push(temp.val);
            temp = temp.next;
        }
        ListNode temp2 = head;
        while(temp2 != null){
            if(s.peek() != temp2.val){
            return false;
            }
            s.pop();
    temp2 = temp2.next;  
        }
        return true;
    }
}