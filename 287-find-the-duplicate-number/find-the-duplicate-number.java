class Solution {
    public int findDuplicate(int[] nums) {
        // int max=nums.length-1;
        // int sum=max*(max+1)/2;
        // int totalSum=0;
        // for(int i=0;i<nums.length;i++){
        //     totalSum+=nums[i];                 this will only workif no. repeats only  once
        // }
        // return totalSum-sum;

        // 1) sort asc and return first repeating eelement
        // 2) Hashset loop(search duplicate if not then insert in set)
        // 3) loop(swap nums[0]<->nums[nums[0]] if both are equal return that]
        // 4) like 3...nums[abs nums[nums[0]]<0]break or make it negative
        int duplicate = -1;
        for (int i = 0; i < nums.length; i++) {
            int now = Math.abs(nums[i]);
            if (nums[now] < 0) {
                duplicate = now;
                break;
            }
            nums[now] *= -1;
        }
        
        // Restore numbers
        for (int i = 0; i < nums.length; i++)
            nums[i] = Math.abs(nums[i]);

        return duplicate;


        
    }
}