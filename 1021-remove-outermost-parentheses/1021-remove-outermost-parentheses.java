class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int ob=0;
        if(s.length()<2){
            return "";
        }
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='('){
                ob++;
                if(ob>1){result.append(c[i]);}
            }else{
                if(ob>1){result.append(c[i]);}
                ob--;
            }
        }
        return result.toString();
    }
}