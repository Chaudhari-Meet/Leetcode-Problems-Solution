class Solution {
    public void rotate(int[][] mat) {
        int n = mat.length, k = n - 1;
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res[i][j] = mat[n-1-j][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = res[i][j];
            }
        }
    }
}