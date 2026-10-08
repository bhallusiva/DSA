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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Queue<TreeNode> q = new LinkedList<>();
        // Queue<Integer> sumQ = new LinkedList<>();
        //     if( root == null)
        // {
        //     return false;
        // }
        // q.offer(root);
        // sumQ.offer(root.val);
    
    
        
        // while(!q.isEmpty())
        // {
        //     int size = q.size();
            
        //     for(int i = 0; i<size; i++)
        //     {
        //         TreeNode node = q.poll();
                
        //         int sum = sumQ.poll();
        //         if(node.left == null && node.right == null )
        //         {
        //             if(sum == targetSum){
        //                 return true;
        //             }
        //         }
        //         if(node.left != null)
        //         {
        //             q.offer(node.left);
        //             sumQ.offer(sum+node.left.val);
        //         }
        //         if(node.right != null)
        //         {
        //             q.offer(node.right);
        //             sumQ.offer(sum+node.right.val);
        //         }
                
        //     }
        // }
        // return false;
        return dfs(root,targetSum,0);
    }
    private boolean dfs(TreeNode root,int target,int sum)
    {
        if(root==null)
        {
            return false;
        }

       sum = sum+root.val;
        if(root.left == null && root.right == null)
        {
            return sum==target;
        }
         
        return dfs(root.left,target,sum)||dfs(root.right,target,sum);
    }
}