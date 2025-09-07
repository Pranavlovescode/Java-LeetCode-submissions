class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        boolean allEqual = true;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                allEqual = false;
                break;
            }
        }
        
        if (allEqual) return 0;

        int minOps = n;
        
        for (int i = 0; i < n; i++) {
            int currentAnd = nums[i];
            for (int j = i; j < n; j++) {
                currentAnd &= nums[j];
                if (currentAnd == nums[i]) {
                    minOps = Math.min(minOps, 1 + (j < n - 1 ? minOps : 0));
                    break;
                }
            }
        }
        
        return minOps;
    }
}