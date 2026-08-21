class Solution {
    public int diagonalSum(int[][] mat) {
        int d1=0,d2=0;
        int size = mat.length;;
        for(int i=0;i<size;i++){
            d1+=mat[i][i];
            d2+=mat[i][size-1-i];
        }
        return (size%2 != 0) ? d1+d2-mat[size/2][size/2] : d1+d2 ;
    }
}