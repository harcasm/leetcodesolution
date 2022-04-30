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
    public boolean isValidBST(TreeNode root) {
        return traverseAndCheck(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
    }
    public boolean traverseAndCheck(TreeNode root, Long left, Long right) {
         if(root == null ) {
             return true;
         }
         if (!(root.val < right && root.val > left)) {
             return false;
         }
         return traverseAndCheck(root.left, left, Long.valueOf(root.val)) && traverseAndCheck(root.right, Long.valueOf(root.val), right);
    }
}