/*
    P4: Symmetric Tree
	
	Example 1:
	Input: root = [1,2,2,3,4,4,3]
	Output: true
	
	Example 2:
	Input: root = [1,2,2,null,3,null,3]
	Output: false

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
class Problem4 {
    public boolean Symmetric(TreeNode left, TreeNode right){
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        if(left.val != right.val)
            return false;
        return (Symmetric(left.right, right.left) && Symmetric(left.left,right.right));
    }
    public boolean isSymmetric(TreeNode root) {
        return Symmetric(root.left,root.right);
    }
}

/*


*/