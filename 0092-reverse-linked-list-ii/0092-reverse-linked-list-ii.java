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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || head.next == null || right == left)
        {
            return head;
        }
        ListNode leftList = head;
        ListNode rightList = head;
        ListNode beforeLeft = null;

        for(int i = 1; i<left; i++)
        {   beforeLeft = leftList;
            leftList = leftList.next;
        }
        for(int j = 1;j<right;j++)
        {
            rightList = rightList.next;
        }
        ListNode afterRight = rightList.next;
        ListNode temp = leftList;
        ListNode prev = afterRight;
        while(temp!=afterRight)
        {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        if(beforeLeft == null)
        {
            head = rightList;
        }else{
            beforeLeft.next = rightList;
        }

        return head;

    }
}