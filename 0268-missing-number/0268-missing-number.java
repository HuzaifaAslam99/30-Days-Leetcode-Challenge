class Solution {
    public int missingNumber(int[] nums) {
        
         int missingNumber = 0;
        boolean check = false;
        int i = 0;
        int j = 0;
        int small = Integer.MAX_VALUE; // Initialize small to maximum possible integer
        int large = Integer.MIN_VALUE; // Initialize large to minimum possible integer
        
        // Find the smallest and largest numbers in the array
        for (i = 0; i < nums.length; i++) {
            if (nums[i] < small) {
                small = nums[i];
            }
            if (nums[i] > large) {
                large = nums[i];
            }
        }

        // If the smallest number is greater than 0, start the search from 0
        if (small > 0) {
            missingNumber = 0;
        } else {
            // Check for the missing number between small and large
            for (i = small + 1; i <= large; i++) {
                check = false;
                for (j = 0; j < nums.length; j++) {
                    if (i == nums[j]) {
                        check = true;
                        break;
                    }
                }
                if (!check) {
                    missingNumber = i;
                    break;
                }
            }
        }

        // If no missing number found, return the next number after the largest
        if (!check) {
            if (large == 0) {
                return 1; // Special case when the largest is 0
            } else {
                return missingNumber;
            }
        } else {
            return large + 1;
        }
    }
 
    }
