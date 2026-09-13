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
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
         
        ListNode prev = null;
        ListNode temp = slow;
        while(temp!=null)
        {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
            
        }
        ListNode temp2 = prev;
        ListNode temp3 = head;
        while(temp2!=null)
        {
            if(temp2.val != temp3.val)
            {
                return false;
            }
            temp2 = temp2.next;
            temp3 = temp3.next;
        }
        return true;

       
    }
}