class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> numbers = new HashMap<>();
        for(int num : nums){
            if(numbers.containsKey(num)){
                numbers.replace(num,numbers.get(num)+1);
            }else{
                numbers.put(num,1);
            }
        }
        for(int n : nums){
            int value=numbers.get(n);
            if(value>1){
                return true;
            }
        }
        return false;
    }
}