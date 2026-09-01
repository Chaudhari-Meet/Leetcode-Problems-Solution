class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            int c = 1;
            List<Integer> sub = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    sub.add(1);
                }else{
                    c = c * (i-j+1)/(j);
                    sub.add(c);
                }
            }
            res.add(sub);
        }
        return res;
    }
}