class Solution {
    public int maxProfit(int[] prices) {
        
        //the main thing is to deduce that this situation is equal to buying and selling immediately at the next bigger no. ie. sum up all differences where[i]>[i-1] 
        int sum=0;
        for(int i=1;i<prices.length;i++){
            if(Math.max(0,prices[i]-prices[i-1])>0){
                sum+=prices[i]-prices[i-1];
            }
        }
        return sum;
    }
}