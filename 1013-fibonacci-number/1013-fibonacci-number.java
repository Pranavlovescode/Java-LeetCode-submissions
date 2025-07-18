class Solution {
    public int calculateFib(int n, int[] dp) {
        if (n <= 1)
            return n;
        if (dp[n] != -1)
            return dp[n];
        dp[n] = calculateFib(n - 1, dp) + calculateFib(n - 2, dp);
        return dp[n];
    }

    public int fib(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int ans = calculateFib(n, dp);
        return ans;
    }
}