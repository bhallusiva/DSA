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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(root,ans,list,0,targetSum);
        return ans;
    }
    void dfs(TreeNode root,List<List<Integer>> ans , List<Integer> list, int sum , int targetSum)
    {
        if(root==null)
        {
            return;
        }
        sum = sum+root.val;
        list.add(root.val);
        if(root.left == null && root.right == null)
        {
            if(sum == targetSum)
            {
                ans.add(new ArrayList<>(list));
            }
            //backtrack
            list.remove(list.size()-1);
            return;
        }

        
        dfs(root.left,ans,list,sum,targetSum);
        dfs(root.right,ans,list,sum,targetSum);
        list.remove(list.size()-1);

    }
}