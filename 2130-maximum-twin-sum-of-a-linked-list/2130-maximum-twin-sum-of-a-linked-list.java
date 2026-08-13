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
    public int pairSum(ListNode head) {
        int maxTwinSum = 0;
        if(head==null || head.next == null)
        {
            return 0;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode temp = slow;
        ListNode prev = null;
        while(temp!=null)
        {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        ListNode temp2 = prev;
        temp = head;
        while(temp2 != null)
        {
            maxTwinSum = Math.max(maxTwinSum,temp2.val + temp.val);
            temp2 = temp2.next;
            temp = temp.next;
        }
        return maxTwinSum;
    }
}