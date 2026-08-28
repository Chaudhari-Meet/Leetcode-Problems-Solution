class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){return x;}
        long l=1,r=x/2,res=1;
        while(l<=r){
            long mid = l + (r-l)/2;
            if(mid*mid <= x){
                res = mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return (int)res;
    }
}