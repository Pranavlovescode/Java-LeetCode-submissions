class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int> pos;
        vector<int> neg;
        vector<int> ans;
        for(int i=0; i<nums.size(); i++){
            if(nums[i]<0) neg.push_back(nums[i]);
            else pos.push_back(nums[i]);
        }
        int posIdx = 0, negIdx = 0;
        for(int i=0; i<nums.size(); i++){
            if(i%2 == 0) {
                ans.push_back(pos[posIdx++]);
            }
            else{
                ans.push_back(neg[negIdx++]);
            }
        }
        return ans;
    }
};