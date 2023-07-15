class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res= new int[2];
        boolean mark=false;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){         
                if(i==j)continue;               // trying all combinations with leetsync
                else{
                    if(nums[i]+nums[j]==target){
                        res[0]=i;
                        res[1]=j;
                        mark=true;
                        break;
                    }

                }
            }
            if(mark==true) break;
        }
        return res;
        
    }
}