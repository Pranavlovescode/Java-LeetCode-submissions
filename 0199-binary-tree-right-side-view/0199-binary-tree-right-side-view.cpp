/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void rightside(vector<int> &v, TreeNode* root, int level) {
        if (!root) return;

        if (level == v.size()) {
            v.push_back(root->val);
        }

        rightside(v, root->right, level + 1);
        rightside(v, root->left, level + 1);
    }

    vector<int> rightSideView(TreeNode* root) {
        vector<int> result;
        rightside(result, root, 0);
        return result;
    }
};
