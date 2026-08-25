class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> mul = new HashSet<>();
        for(int i:nums){
            if(i%k==0){
                mul.add(i);
            }
        }
        int miss = 0;
        for(int i=k;i<=10000;i+=k){
            if(mul.contains(i)){
                continue;
            }else{
                miss=i;
                break;
            }
        }
        return miss;
    }
}