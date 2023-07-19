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
// // Shift non-zero values as far forward as possible
// // Fill remaining space with zeros

// public void moveZeroes(int[] nums) {
//     if (nums == null || nums.length == 0) return;        

//     int insertPos = 0;
//     for (int num: nums) {
//         if (num != 0) nums[insertPos++] = num;  ----all non zero will be gatherd in front
//     }        

//     while (insertPos < nums.length) {
//         nums[insertPos++] = 0;            ---add zeros in last remaining indexes
//     }
// }