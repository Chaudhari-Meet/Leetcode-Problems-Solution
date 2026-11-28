class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> arr = new HashMap<>();
        for(int i:nums){
            if(arr.containsKey(i)){
                arr.put(i,arr.get(i) + 1);
            }else{
                arr.put(i,1);
            }
        }
        int maxVal = Collections.max(arr.values());
        for (Map.Entry<Integer, Integer> entry : arr.entrySet()) {
            if (entry.getValue() == maxVal) {
                return entry.getKey();
            }
        }
        
        return -1;
    }
}