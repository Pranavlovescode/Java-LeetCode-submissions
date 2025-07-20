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
    int rightSubTreeHeight =0;
    int leftSubTreeHeight = 0;
    public int traverse(TreeNode root){
        if(root == null) return 0;
        int left = traverse(root.left);
        int right= traverse(root.right);
        return 1 + Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        leftSubTreeHeight = traverse(root.left);
        rightSubTreeHeight = traverse(root.right);

        if(Math.abs(rightSubTreeHeight-leftSubTreeHeight)<=1 && isBalanced(root.left) && isBalanced(root.right)) return true;
        return false;
    }
}