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