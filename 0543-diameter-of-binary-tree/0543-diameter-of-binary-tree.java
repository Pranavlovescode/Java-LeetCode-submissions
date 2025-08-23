class Solution {
    int diameter =0;
    public int calculateHeight(TreeNode root){
        if(root == null) return 0;

        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);

        diameter = Math.max(diameter, leftHeight+rightHeight);

        return 1+Math.max(leftHeight, rightHeight);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeight(root);
        return diameter;        
    }
}