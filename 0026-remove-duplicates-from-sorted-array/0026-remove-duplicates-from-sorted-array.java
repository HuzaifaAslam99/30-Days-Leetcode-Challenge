class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; 

        int uniqueCount = 1; 
        int current = nums[0]; 
        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] != current) {

                current = nums[i];
                nums[uniqueCount] = nums[i];

                uniqueCount++;
            }
        }

        return uniqueCount; // Return the count of unique elements
    }
}