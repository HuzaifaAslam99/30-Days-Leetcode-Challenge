class Solution {
    public int findMin(int[] nums) {
        int minimum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (minimum > nums[i]) {
                minimum = nums[i];
            }
        }
        return minimum; 
    }
}