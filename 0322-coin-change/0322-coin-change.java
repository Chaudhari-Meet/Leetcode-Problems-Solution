class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0){
            return 0;
        }
        return dpCoinChange(coins,amount);
    }
    public int dpCoinChange(int[] coins,int total){
        int n = coins.length;
        int[] dp = new int[total+1];
        Arrays.fill(dp,total+1);
        dp[0] = 0;
        for(int i=1;i<=total;i++){
            for(int j=0;j<n;j++){
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }
        return dp[total] > total ? -1 : dp[total];
    }
}