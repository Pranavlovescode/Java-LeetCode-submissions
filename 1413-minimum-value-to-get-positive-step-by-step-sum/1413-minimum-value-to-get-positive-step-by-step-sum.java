class Solution {
    public int minStartValue(int[] nums) {
        int prefixSum = 0, minPrefix = 0;
        for(int num : nums){
            prefixSum += num;
            minPrefix = Math.min(prefixSum, minPrefix);
        }
        return 1 - minPrefix;
    }
}