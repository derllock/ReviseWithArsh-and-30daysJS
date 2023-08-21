class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--; // even if we were to advance the left pointer to a taller height, the right pointer(which is shorter) will be used as the cutoff height in calculating the area. Hence, whatever future area calculated will always be less than our original area (since the distance between left and right pointer is max)
            else {
                left++;
                right--;
            }
        }
        return max;
    }
}