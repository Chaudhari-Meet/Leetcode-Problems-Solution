class Solution {
    public int maxDepth(String s) {
        int length = s.length();
        int result = 0;
        int count = 0;
        for(int i = 0 ; i<length ; i++){
            if(s.charAt(i)=='('){
                count++;
                result = Math.max(result,count);
            }
            else if(s.charAt(i)==')'){
                count--;
            }
        }
        return result;
    }
}