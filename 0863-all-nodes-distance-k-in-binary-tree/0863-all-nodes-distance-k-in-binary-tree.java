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
    HashMap<TreeNode,TreeNode> parent = new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        buildParent(root,null);
        fetchTheNode(root,target,k,ans);
        return ans;
          

    }
    private void fetchTheNode(TreeNode root,TreeNode target,int k,List<Integer> ans)
    {

        Queue<TreeNode> q = new LinkedList<>();
          HashSet<TreeNode> visited = new HashSet<>();
          q.offer(target);
          visited.add(target);
          int distance = 0;
          while(!q.isEmpty())
          {
            int size = q.size();
            if(distance == k) 
            {
                break;
            }
            for(int i = 0;i<size; i++)
            {
                TreeNode node = q.poll();
                if(node.left!=null && visited.add(node.left))
                {
                    q.offer(node.left);
                }
                if(node.right!=null && visited.add(node.right))
                {
                    q.offer(node.right);
                }
                TreeNode p = parent.get(node);
                if(p!=null && visited.add(p))
                {
                    q.offer(p);
                }
            }
            distance++;
          }

            for(TreeNode node:q)
            {
                ans.add(node.val);
            }

    }
    private void buildParent(TreeNode root , TreeNode ParentNode)
    {
        if(root == null)
        {
            return;
        }
        parent.put(root,ParentNode);
        buildParent(root.left,root);
        buildParent(root.right,root);
    }
}