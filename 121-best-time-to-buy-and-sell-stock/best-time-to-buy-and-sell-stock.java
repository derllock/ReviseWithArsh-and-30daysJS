class Solution {
    public int maxProfit(int[] prices) {
        int max=0; 
        int[] newPrices=prices.clone();
        
        Arrays.sort(newPrices);
        for(int i=0; i<prices.length-1;i++){
            int j=i+1;
            
            while(j<prices.length){
                if(prices[j]-prices[i]>max){
                    max=prices[j]-prices[i];
                } 
                ++j;
                if(prices[i]==newPrices[0] && j==prices.length)return max;      

            }
        }
        return max;

        
    }
}