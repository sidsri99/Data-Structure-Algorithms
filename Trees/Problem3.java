/*
    P3: Binary Tree Inorder Traversal
	
	Example 1:
	Input: root = [1,null,2,3]
	Output: [1,3,2]

	Example 2:
	Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
	Output: [4,2,6,5,7,1,3,9,8]

	Example 3:
	Input: root = []
	Output: []

	Example 4:
	Input: root = [1]
	Output: [1]

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
class Problem3 {
    public void traverse(TreeNode root, List<Integer> al){
        if(root == null)
            return;
        traverse(root.left,al);
        al.add(root.val);
        traverse(root.right,al);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> al=new ArrayList<Integer>();
        traverse(root,al);
        return al;
    }
}

/*


*/