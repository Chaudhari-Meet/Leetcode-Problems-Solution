class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Map<Integer, Integer> nextMap = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        nextMap.put(nums2[n-1],-1);
        stack.push(nums2[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums2[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextMap.put(nums2[i],-1);
            }else{
                nextMap.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            int val = nextMap.get(nums1[i]);
            nums1[i]=val;
        }
        return nums1;
    }
}
