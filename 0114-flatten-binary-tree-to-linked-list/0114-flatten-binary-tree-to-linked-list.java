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
    ArrayList<TreeNode> list = new ArrayList<>();
    public void flatten(TreeNode root) {
        preorder(root);
        int size = list.size();
        for(int i = 0 ; i<size-1; i++)
        {
            list.get(i).right = list.get(i+1);
            list.get(i).left = null;
        }
    }
    private void preorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        list.add(root);
        preorder(root.left);
        preorder(root.right);
    }
}