import java.util.*;
class Solution {
    public int smallestEqual(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if( i % 10 == nums[i]){
                l.add(i);
            }
        }
        if(l.isEmpty()){
            return -1;
        }
        return Collections.min(l);
    }
}