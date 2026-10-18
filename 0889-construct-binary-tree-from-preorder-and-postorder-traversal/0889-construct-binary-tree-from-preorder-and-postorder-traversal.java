/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int preStart = 0;
    int preEnd;
    int postStart = 0;
    int  postEnd;
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int postStart = preorder.length-1;
        int preStart = preorder.length -1;
        for(int i = 0; i < postorder.length; i++)
        {
            map.put(postorder[i],i);
        }
        return build(preorder,postorder,0,preorder.length-1,0,postorder.length-1);

        
    }
    private TreeNode build(int[] preorder,int[] postorder,int preStart, int preEnd,int postStart,int postEnd)
    {
        if(preStart > preEnd)
        {
            return null;
        }
        TreeNode root =  new TreeNode(preorder[preStart]);
        if(preStart == preEnd) return root;
        int leftRoot = preorder[preStart+1];
        int index = map.get(leftRoot);
        int size = index-postStart+1;
        root.left = build(preorder,postorder,preStart + 1,preStart+size,postStart,index);
        root.right = build(preorder,postorder,preStart + size + 1, preEnd,index+1,postEnd -1);
        return root;

    }
}