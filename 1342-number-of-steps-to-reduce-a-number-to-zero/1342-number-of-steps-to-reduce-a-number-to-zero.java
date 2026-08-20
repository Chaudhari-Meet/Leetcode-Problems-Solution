class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num!=0){
            if(num%2==0){
                c++;
                num=num/2;
            }else{
                num-=1;
                c+=1;
                if(num!=0){
                    c++;
                    num=num/2;
                }
            }
        }
        return c;
    }
}