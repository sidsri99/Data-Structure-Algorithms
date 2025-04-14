/**

  P7: Binary Tree Paths
  
  Example 1:
  Input: root = [1,2,3,null,5]
  Output: ["1->2->5","1->3"]
  
  Example 2:
  Input: root = [1]
  Output: ["1"]

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
class Problem7 {
    public void DFS(TreeNode root,StringBuilder str,List<String> list){
        if(root != null){
            str.append(root.val);
        }
        if(root.left == null && root.right == null){
            list.add(str.toString());
            return;
        }
        str.append("->");
        int len = str.length();
        if(root.right != null){
            //String tmp = str+"->"+(root.right).val;
            DFS(root.right, str,list);
        }
        str.setLength(len);
        if(root.left != null){
            //String tmp = str+"->"+(root.left).val;
            DFS(root.left, str,list);
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<String>();
        StringBuilder str= new StringBuilder("");
        DFS(root,str,list);
        return list;
    }
}
