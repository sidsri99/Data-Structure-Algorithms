/*
    P5: Maximum Depth of Binary Tree

	Example 1:
	Input: root = [3,9,20,null,null,15,7]
	Output: 3

	Example 2:
	Input: root = [1,null,2]
	Output: 2
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
class Problem5 {
    public int getDepth(TreeNode root, int level){
        if(root == null)
            return level;
        else 
            level++;
        return Math.max(getDepth(root.left,level),
                        getDepth(root.right,level));
    }
    public int maxDepth(TreeNode root) {
        return getDepth(root,0);
    }
}

/*


*/