class Solution {
    public int removeDuplicates(int[] nums) {
        int cons=0;
      
        for(int i=0;i<nums.length;i++){
            if(nums[cons]!=nums[i] && cons!=i){
                 ++cons;
                nums[cons]=nums[i];
               
            }

        }
        return cons+1;
        
    }
}