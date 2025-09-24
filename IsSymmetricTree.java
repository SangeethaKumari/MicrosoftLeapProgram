//Leetcode 101. Symmetric Tree

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
class IsSymmetricTree {
    public boolean isSymmetric(TreeNode node1, TreeNode node2) {
        System.out.println(node1 + "    " + node2);
        if (node1 == null && node2 == null) {
          return true;
        }
        if (node1 != null && node2 == null) {
          return false;
        }
        if (node2 != null && node1 == null) {
          return false;
        }
        if (node1.val != node2.val) {
            return false;
        }
        System.out.println(node1.val + " ----" + node2.val);
        return isSymmetric(node1.left, node2.right) &&
         isSymmetric(node1.right, node2.left);

    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isSymmetric(root.left, root.right);

       /**  if(root.left.val != root.right.v){
            return false;
        }
        return isSymmetric(root.left.left, root.right.right) &&
         isSymmetric(root.left.right, root.right.left);
         */
    }
}
