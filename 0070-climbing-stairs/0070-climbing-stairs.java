class Solution {
    public int climbStairs(int n) {
        return solve(n);
    }

    public int solve(int x) {
        int a=1,b=1,c;
        int i=2;
        while(i<=x){
            c=a+b;
            a=b;
            b=c;
            i++;
        }
        return b;
    }
}