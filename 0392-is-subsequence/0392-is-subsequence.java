class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length() == 0 && s.length() == 0){
            return true;
        }else if(s.length() == 0){
            return true;
        }else  if(t.length() == 0){
            return false;
        }
        int small = 0;
        int large = 0;
        while (small < s.length() && large < t.length()) {
            if (s.charAt(small) == t.charAt(large)) {
                small++;
            }
            large++;
        }
        return small == s.length();
    }
}