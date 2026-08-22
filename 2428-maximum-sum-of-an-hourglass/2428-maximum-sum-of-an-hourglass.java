class Solution {
    public int maxSum(int[][] grid) {
        int max=0;
        for(int i=1;i<grid.length - 1;i++){
            for(int j=1;j<grid[0].length - 1 ;j++){
                int s1 = grid[i-1][j-1] + grid[i-1][j] + grid[i-1][j+1];
                int s2 = grid[i][j];
                int s3 = grid[i+1][j-1] + grid[i+1][j] + grid[i+1][j+1];
                if(s1+s2+s3 > max){
                    max = s1+s2+s3;
                }
            }
        }
        return max;
    }
}