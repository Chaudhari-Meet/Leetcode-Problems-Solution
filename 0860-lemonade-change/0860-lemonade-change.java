class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0] == 10 || bills[0] == 20){return false;}
        int count5 = 0;
        int count10 = 0;
        boolean res = true;
        for(int i=0;i<bills.length;i++){
            if(bills[i] == 5){
                count5++;
            }else if(bills[i]==10){
                if(count5 >= 1){
                    count5--;
                    count10++;
                }else{
                    res=false;
                    break;
                }
            }else{
                if(count5>=1 && count10>=1){
                    count5--;
                    count10--;
                }else if(count5>=3 && count10<1){
                    count5 =count5 - 3;
                }else{
                    res=false;
                    break;
                }
            }
        }
        return res;
    }
}