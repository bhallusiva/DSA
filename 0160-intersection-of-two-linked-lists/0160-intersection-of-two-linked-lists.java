/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int LengthA = 0;
        int LengthB =0;
        ListNode A = headA;
        ListNode B = headB;
        while(A!=null)
        {
            LengthA++;
            A = A.next;
        }
        while(B!=null)
        {
            LengthB++;
            B = B.next;
        }
        A = headA;
        B = headB;
        while(LengthB>LengthA)
        {
            LengthB--;
            B = B.next;
        }
        while(LengthA>LengthB)
        {
            LengthA--;
            A=A.next;
        }
        while(A!=B)
        {
            A=A.next;
            B = B.next;
        }
        return A;
    }
}