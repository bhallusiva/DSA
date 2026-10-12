/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode,TreeNode> parentList = new HashMap<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        buildParent(root,null);
        HashSet<Integer> set =new HashSet<>();
        while(p!=null)
        {
            set.add(p.val);
            p = parentList.get(p);
        }
        while(!set.contains(q.val))
        {
            set.add(q.val);
            q = parentList.get(q);
        }
        return q;
    }
    private void buildParent(TreeNode root,TreeNode parent)
    {
        if(root==null )
        {
            return;
        }
        parentList.put(root,parent);
        buildParent(root.left,root);
        buildParent(root.right,root);
    }
    // private TreeNode dfs(TreeNode root,TreeNode p,TreeNode q)
    // {
    //     if(root==null||root==p||root==q)
    //     {
    //         return root;
    //     }
    //     TreeNode left = dfs(root.left,p,q);
    //     TreeNode right = dfs(root.right,p,q);
    //     if(left!=null && right!= null)
    //     {
    //         return root;
    //     }
    //     if(left==null && right == null)
    //     {
    //         return null;
    //     }
    //     return left!=null?left:right;

    // }
}