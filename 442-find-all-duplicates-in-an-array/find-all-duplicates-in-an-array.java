class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> numsTable=new HashSet<Integer>();
        List<Integer> repeated=new ArrayList<Integer>();
        for(int num:nums){
            if(numsTable.contains(num))repeated.add(num);
            numsTable.add(num);
        }
        return repeated;
    }
}
// just convert to - the array value visited
// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> ans = new ArrayList<>();

//         for (int num : nums) {                                                   // fundamental find duplicates in array in O(N) works because every value in array is less than length of array
//             if (nums[Math.abs(num) - 1] < 0) { // seen before                      
//                 ans.add(Math.abs(num));
//             }
//             nums[Math.abs(num) - 1] *= -1;                                        // just convert that index value to minus ewhich is visited 
//         }

//         return ans;
//     }
//}
