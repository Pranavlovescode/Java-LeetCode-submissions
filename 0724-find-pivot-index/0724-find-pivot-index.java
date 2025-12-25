class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        ArrayList<Integer> sumLeft = new ArrayList<>(n);
        ArrayList<Integer> sumRight = new ArrayList<>(n);

        // Fill lists with 0s
        for (int i = 0; i < n; i++) {
            sumLeft.add(0);
            sumRight.add(0);
        }

        // Prefix sum
        sumLeft.set(0, nums[0]);
        for (int i = 1; i < n; i++) {
            sumLeft.set(i, sumLeft.get(i - 1) + nums[i]);
        }

        // Suffix sum
        sumRight.set(n - 1, nums[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            sumRight.set(i, sumRight.get(i + 1) + nums[i]);
        }

        // Pivot check
        for (int i = 0; i < n; i++) {
            int left = (i == 0) ? 0 : sumLeft.get(i - 1);
            int right = (i == n - 1) ? 0 : sumRight.get(i + 1);
            if (left == right) return i;
        }

        return -1;
    }
}
