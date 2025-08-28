class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return checkTree(root.left, root.right);
    }
    public boolean checkTree(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p== null || q == null || p.val != q.val) return false;
        return checkTree(p.left,q.right) && checkTree(p.right, q.left);
    }
}