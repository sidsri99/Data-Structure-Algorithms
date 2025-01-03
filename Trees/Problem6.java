/**
  
  P6: Find Largest Value in Each Tree Row

  Example 1:
  Input: root = [1,3,2,5,3,null,9]
  Output: [1,3,9]
  
  Example 2:
  Input: root = [1,2,3]
  Output: [1,3]
  
*/

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
class Problem6{
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<Integer>();
        if(root == null)return ans;
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int maximum = Integer.MIN_VALUE;
            while(size-->0){
                TreeNode tmp = queue.poll();
                maximum = Math.max(tmp.val,maximum);
                if(tmp.right != null)
                    queue.add(tmp.right);
                if(tmp.left != null)
                    queue.add(tmp.left);
            }
            ans.add(maximum);
        }
        return ans;
    }
}

/*
>[]
[]
>[1,2,3]
[1,3]
>[1,3,2,5,3,null,9]
[1,3,9]
*/
