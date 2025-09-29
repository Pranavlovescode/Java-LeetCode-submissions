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
    void dfs(TreeNode* root, string path, vector<string>& ans) {
        if (!root) return;

        // add current node value to path
        if (path.empty())
            path += to_string(root->val);
        else
            path += "->" + to_string(root->val);

        // if leaf node, push to result
        if (!root->left && !root->right) {
            ans.push_back(path);
            return;
        }

        // otherwise, continue DFS
        dfs(root->left, path, ans);
        dfs(root->right, path, ans);
    }

    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> ans;
        dfs(root, "", ans);
        return ans;
    }
};