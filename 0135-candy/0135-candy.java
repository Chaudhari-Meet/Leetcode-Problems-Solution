import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if (n == 0) return 0;
        List<Integer> candies = new ArrayList<>(Collections.nCopies(n, 1));
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies.set(i, candies.get(i - 1) + 1);
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies.set(i, Math.max(candies.get(i), candies.get(i + 1) + 1));
            }
        }
        int totalCandies = 0;
        for (int c : candies) {
            totalCandies += c;
        }

        return totalCandies;
    }
}