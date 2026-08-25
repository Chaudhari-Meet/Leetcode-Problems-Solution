class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int ob=0;
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