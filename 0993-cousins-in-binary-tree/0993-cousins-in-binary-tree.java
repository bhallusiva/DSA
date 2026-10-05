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
    TreeNode xParent = null;
    TreeNode yParent = null;
    int xLevel = -1;
    int yLevel = -1;
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root,null,0,x,y);
        return xLevel == yLevel && xParent!=yParent;
        
        
    }
    private void dfs (TreeNode root,TreeNode Parent,int level ,int x,int y)
    {
        if(root == null)
        {
            return;
        }
        if(root.val == x)
        {
            xLevel = level;
            xParent = Parent;
        }
        if(root.val == y)
        {
            yLevel = level;
            yParent = Parent;
        }
        dfs(root.left,root,level+1,x,y);
        dfs(root.right,root,level+1,x,y);
        


    }
}