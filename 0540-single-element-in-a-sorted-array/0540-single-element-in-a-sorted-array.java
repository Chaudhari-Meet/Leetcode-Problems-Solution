class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer,Integer> myMap = new HashMap<>();
        for(int num : nums){
            if(myMap.containsKey(num)){
                myMap.replace(num,myMap.get(num) + 1);
            }else{
                myMap.put(num,1);
            }
        }
        for(int num : nums){
            if(myMap.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}