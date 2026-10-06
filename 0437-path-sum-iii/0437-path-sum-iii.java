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
    public int pathSum(TreeNode root, int targetSum) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
        {
            return 0;
        }
        q.offer(root);
        int count = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i = 0;i<size;i++)
            {
                TreeNode node = q.poll();
                count+=findPaths(node,(long)targetSum);
                if(node.left!=null)
                {
                    q.offer(node.left);
                }
                if(node.right != null)
                {
                    q.offer(node.right);
                }
            }
        }
        return count;
           
     

    }
    int findPaths(TreeNode root,long targetSum)
    {
        if(root == null)
        {
            return 0;
        }
        int count = 0;
        if(root.val == targetSum)
        {
            count++;
        }
        count+=findPaths(root.left,targetSum-root.val);
        count+=findPaths(root.right,targetSum-root.val);
        return count;
    }
}