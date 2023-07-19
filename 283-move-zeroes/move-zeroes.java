class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){
                count++;
                int j=i+1;
                while(j<nums.length){
                    nums[j-1]=nums[j];
                    j++;
                }
                nums[j-1]=0;
                i=-1;

            }
            if(i==nums.length-1-count)break;
        }
        
    }
}