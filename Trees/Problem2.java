/*
    Reverse Odd Levels of Binary Tree
	
	Example 1:
	Input: root = [2,3,5,8,13,21,34]
	Output: [2,5,3,8,13,21,34]
	Explanation: 
	The tree has only one odd level.
	The nodes at level 1 are 3, 5 respectively, which are reversed and become 5, 3.
	
	Example 2:
	Input: root = [7,13,11]
	Output: [7,11,13]
	Explanation: 
	The nodes at level 1 are 13, 11, which are reversed and become 11, 13.

	Example 3:
	Input: root = [0,1,2,0,0,0,0,1,1,1,1,2,2,2,2]
	Output: [0,2,1,0,0,0,0,2,2,2,2,1,1,1,1]
	Explanation: 
	The odd levels have non-zero values.
	The nodes at level 1 were 1, 2, and are 2, 1 after the reversal.
	The nodes at level 3 were 1, 1, 1, 1, 2, 2, 2, 2, and are 2, 2, 2, 2, 1, 1, 1, 1 after the reversal.

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
class Problem2 {
    public void reverseOdd(TreeNode leftNode, TreeNode rightNode, int level){
        if(leftNode == null)return;
        if((level&1) != 1){
            int value = leftNode.val;
            leftNode.val = rightNode.val;
            rightNode.val = value;
            
        }
        reverseOdd(leftNode.left,rightNode.right,level+1);
        reverseOdd(leftNode.right, rightNode.left,level+1);
        return;
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        TreeNode tmp = root;
        reverseOdd(root.left,root.right,0);
        return root;
    }
}

/*


*/