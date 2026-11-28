class Solution {
    public int kInversePairs(int n, int k) {
        int MOD = 1_000_000_007;

        int maxInversions = n * (n - 1) / 2;
        if (k > maxInversions) {
            return 0;
        }
        if (k == 0 || k == maxInversions) {
            return 1;
        }
        int[] prev = new int[k + 1];
        prev[0] = 1;
        for (int i = 1; i <= n; i++) {
            int[] curr = new int[k + 1];
            curr[0] = 1;
            int rowLimit = Math.min(k, i * (i - 1) / 2);

            for (int j = 1; j <= rowLimit; j++) {
                long val = (long) curr[j - 1] + prev[j];
                if (j >= i) {
                    val -= prev[j - i];
                }
                curr[j] = (int) ((val % MOD + MOD) % MOD);
            }
            prev = curr;
        }

        return prev[k];
    }
}