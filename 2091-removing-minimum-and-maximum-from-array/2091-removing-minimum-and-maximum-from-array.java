class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        
        int max_value = Integer.MIN_VALUE;
        int min_value = Integer.MAX_VALUE;
        int max_index = 0;
        int min_index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < min_value) {
                min_value = nums[i];
                min_index = i;
            }
            if (nums[i] > max_value) {
                max_value = nums[i];
                max_index = i;
            }
        }
        int a = Math.min(min_index, max_index);
        int b = Math.max(min_index, max_index);
        int deleteFromLeft = b + 1;
        int deleteFromRight = n - a;
        int deleteFromBothEnds = (a + 1) + (n - b);
        return Math.min(deleteFromLeft, Math.min(deleteFromRight, deleteFromBothEnds));
    }
}
