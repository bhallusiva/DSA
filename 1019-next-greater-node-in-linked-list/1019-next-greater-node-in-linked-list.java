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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        while(head!=null)
        {
            list.add(head.val);
            head = head.next;
        }
        int n = list.size();
        int[] nums = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=list.get(i))
            {
                st.pop();
            }
                if(!st.isEmpty())
                {
                    nums[i] = st.peek();
                }
                st.push(list.get(i));
            
        }
        return nums;

    }
}