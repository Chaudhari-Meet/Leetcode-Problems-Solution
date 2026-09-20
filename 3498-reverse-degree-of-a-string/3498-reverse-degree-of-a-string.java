class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int index=1;
        for(char ch : s.toCharArray()){
            int num = Math.abs(26 - (int)(ch -'a'));
            sum += index * num;
            index++;
        }
        return sum;
    }
}