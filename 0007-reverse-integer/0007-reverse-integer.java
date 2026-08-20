class Solution {
    public int reverse(int x) {
        int rev=0;
        boolean neg = false;
        if(x<0){
            neg = true;
            x=-x;
        }
        while(x>0){
            int rem = x%10;
            x = x/10;
            if (rev > (Integer.MAX_VALUE - rem) / 10) {
                return 0;
            }
            rev = rev*10 + rem;
        }
        return neg ? -rev : rev ;
    }
}