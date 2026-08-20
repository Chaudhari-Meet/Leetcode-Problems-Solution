class Solution {
    public long coloredCells(int n) {
        if(n==1){
            return 1;
        }else{
            long sum=1;
            for(int i=1;i<n;i++){
                sum += 4*i;
            }
            return sum;
        }
    }
}