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

    class pair{
        TreeNode node;
        int height;
        pair(TreeNode node,int height)
        {
            this.node = node;
            this.height = height;
        }
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return dfs(root).node;
    }
    private pair dfs(TreeNode root)
    {
        if(root==null)
        {
            return new pair(null,0);
        }
        pair left = dfs(root.left);
        pair right = dfs(root.right);
        if(left.height == right.height)
        {
            return new pair(root,left.height+1);
        }
        if(left.height>right.height)
        {
            return new pair(left.node,left.height+1);
        }
        return new pair(right.node,right.height+1);
    }
}