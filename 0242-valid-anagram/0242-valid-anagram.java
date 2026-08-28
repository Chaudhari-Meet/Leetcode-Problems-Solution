class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> str = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(str.containsKey(ch)){
                str.put(ch,str.get(ch)+1);
            }else{
                str.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch1 = t.charAt(i);
            if(str.containsKey(ch1)){
                if(str.get(ch1) > 1){
                    str.replace(ch1,str.get(ch1) - 1);
                }else{
                    str.remove(ch1);
                }
            }
        }
        return str.isEmpty();
    }
}