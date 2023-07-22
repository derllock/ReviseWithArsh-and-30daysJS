class Solution {
    public void sortColors(int[] nums) {
        
        int red=0, white=0,blue=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0)++red;
            else if(nums[i]==1)++white;
            else if(nums[i]==2)++blue;
        }
        
        for(int i=0;i<nums.length;i++){    //just count no. of 0,1,2 and print one by one
            if(i<red)nums[i]=0;
            else if( white-->0){
                nums[i]=1;
            }
            else nums[i]=2;
        }
    }
 }