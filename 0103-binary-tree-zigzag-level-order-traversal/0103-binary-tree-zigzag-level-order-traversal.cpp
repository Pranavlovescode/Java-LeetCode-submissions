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
    vector<int> first;
    vector<vector<int>> res;
    queue<TreeNode*> q;
    

    void zigzagTraversal(TreeNode* root){
        int cnt =0;
        q.push(root);
        q.push(nullptr);

        while(!q.empty()){
            TreeNode* node = q.front();
            q.pop();
            if(node == nullptr){
                if(cnt % 2 != 0){
                    reverse(first.begin(), first.end());
                    res.push_back(first);                    
                }
                if(cnt % 2 == 0){
                    res.push_back(first);
                }
                first.clear();
                if(!q.empty()){
                    q.push(nullptr);
                    cnt++;
                }
            } 
            else{
                first.push_back(node->val);
                if(node->left != NULL){
                    q.push(node->left);
                }
                if(node->right != NULL){
                    q.push(node->right);
                }
            }
        }

    }

    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        // vector<vector<int>> res;
        if(root == NULL) return res;
        if(root->left == NULL && root->right == NULL) {
            first.push_back(root->val);
            res.push_back(first);
            return res;
        }
        zigzagTraversal(root);
        return res;
    }
};