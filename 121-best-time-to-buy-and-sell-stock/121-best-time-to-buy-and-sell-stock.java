class Solution {
    public int maxProfit(int[] prices) {
        
        
        
        int min = Integer.MAX_VALUE ;
        min =  prices[0];
        int maxprofit = 0  ; 
        for(int i = 1; i <prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
            }else{
                maxprofit =Math.max(maxprofit,prices[i]-min);    
            }
        }
        return maxprofit ;
        
    }
}