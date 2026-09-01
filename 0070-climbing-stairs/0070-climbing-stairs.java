class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }

    public int solve(int x, int[] dp) {
        if (x <= 1) {
            return 1;
        }
        if (dp[x] != -1) {
            return dp[x];
        }
        dp[x] = solve(x - 1, dp) + solve(x - 2, dp);
        return dp[x];
    }
}