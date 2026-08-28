class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(int num : nums){
            if(!numbers.contains(num)){
                numbers.add(num);
            }else{
                return true; 
            }
        }
        if(numbers.size() == nums.length){
            return false;
        }
        return false;
    }
}