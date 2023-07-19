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
                    if(prices[i]==newPrices[0] && prices[i]==newPrices[prices.length-1])return max; // this to just optimize
                } 
                ++j;
                if(prices[i]==newPrices[0] && j==prices.length)return max;  // this is just to optimize,here buying price is minimum so no need to move further as difference will be maximum here.
                      

            }
        }
        return max;

        
    }
}

// class Solution {
//     public int maxProfit(int[] prices) {
//         int lsf = Integer.MAX_VALUE;
//         int op = 0;
//         int pist = 0;
        
//         for(int i = 0; i < prices.length; i++){
//             if(prices[i] < lsf){
//                 lsf = prices[i];
//             }
//             pist = prices[i] - lsf;
//             if(op < pist){
//                 op = pist;
//             }
//         }
//         return op;
//     }
// }