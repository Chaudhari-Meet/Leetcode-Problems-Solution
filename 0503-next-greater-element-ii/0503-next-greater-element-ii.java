class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            int start_index=(i+1)%n;
            result[i]=-1;
            while(start_index!=i){
                if(nums[i]<nums[start_index]){
                    result[i]=nums[start_index];
                    break;
                }else{
                    start_index = (start_index + 1) % n;
                }
            }
        }
        return result;
    }
}