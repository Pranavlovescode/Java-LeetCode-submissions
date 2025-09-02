class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> ans;
        map<int, int> m;
        for(int it:nums){
            m[it]++;
        }
        // for(auto it:m){
        //     cout << it.first << " -> " << it.second << endl; 
        // }
        for(auto it:m){
            if(it.second > nums.size()/3) ans.push_back(it.first);
        }
        return ans;
    }
};