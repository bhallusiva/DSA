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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head.next == null || k == 1)
        {
            return head;
        }
        ListNode temp = head;
         ListNode prev = null;
        while(temp != null)
        {
            ListNode kthNode = findKthNode(temp,k);
           
            if(kthNode == null)
            {
                if(prev!=null) prev.next = temp;
                break;
            }else{
                ListNode nextNode = kthNode.next;
                kthNode.next = null;
                reverse(temp);
                if(temp == head)
                {
                    head = kthNode;
                }else{
                    if(prev != null)
                        prev.next = kthNode;
                }

                prev = temp;
                temp = nextNode;
            }
        }
        return head;
    }
    private ListNode findKthNode(ListNode temp,int k)
    {
        ListNode temp2 = temp;
        for(int i = 1;i<k;i++)
        {
            if(temp2 == null)
                return null;
            temp2 = temp2.next;
        }
        return temp2;
    }
    private void reverse(ListNode temp)
    {
        ListNode temp3 = temp;
        ListNode prev = null;
        while(temp3!=null)
        {
            ListNode front = temp3.next;
            temp3.next = prev;
            prev = temp3;
            temp3 = front;
        }
    }
}