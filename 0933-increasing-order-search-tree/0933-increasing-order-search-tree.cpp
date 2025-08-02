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
    vector<TreeNode*> v;
    void traverse(TreeNode* root){
        if(root == NULL) return;

        traverse(root->left);
        v.push_back(root);
        traverse(root->right);
    }
    
    TreeNode* buildTree(TreeNode* root,int value){
        if(root == NULL) {
            return new TreeNode(value);
        }
        if(root->val < value){
            root->right = buildTree(root->right, value);
        }
        return root;
    }
    TreeNode* increasingBST(TreeNode* root) {
        traverse(root);
        TreeNode* node = NULL;
        for(int i=0;i<v.size();i++){
            node = buildTree(node,v[i]->val);
        }
        return node;
    }
};