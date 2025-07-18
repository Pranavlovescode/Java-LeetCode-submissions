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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Queue<TreeNode> q1 = new LinkedList<>();
        // Queue<TreeNode> q2 = new LinkedList<>();

        // ArrayList<Integer> arr1 = new ArrayList<>();
        // ArrayList<Integer> arr2 = new ArrayList<>();

        // q1.add(p);
        // q2.add(q);

        // while (!q1.isEmpty() && !q2.isEmpty()) {
        //     TreeNode node1 = q1.poll();
        //     TreeNode node2 = q2.poll();

        //     if (node1 == null && node2 == null) {
        //         arr1.add(null);
        //         arr2.add(null);
        //         continue;
        //     }

        //     if (node1 == null || node2 == null) return false;

        //     arr1.add(node1.val);
        //     arr2.add(node2.val);

        //     q1.add(node1.left);
        //     q1.add(node1.right);

        //     q2.add(node2.left);
        //     q2.add(node2.right);
        // }

        // for (int i = 0; i < arr1.size(); i++) {
        //     if (!Objects.equals(arr1.get(i), arr2.get(i))) return false;
        // }

        // return true;

        // recursive approach

        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}