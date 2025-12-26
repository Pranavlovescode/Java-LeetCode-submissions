class Solution {
public:
    int minStartValue(vector<int>& nums) {
        int prefixSum = 0, minPrefix = 0;
        for(int num : nums){
            prefixSum += num;
            minPrefix = min(prefixSum, minPrefix);
        }
        return 1 - minPrefix;
    }
};