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
        int count  = 0;
        if(head == null || head.next==null)
        {
            return null;
        }
        ListNode temp = head;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        int key = count/2;
        temp = head;
        for(int i = 1;i<key;i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;

    }
}