class Solution {
    public int missingNumber(int[] nums) {
        
         int missingNumber = 0;
        boolean check = false;
        int i = 0;
        int j = 0;
        int small = Integer.MAX_VALUE; 
        int large = Integer.MIN_VALUE;
        
       
        for (i = 0; i < nums.length; i++) {
            if (nums[i] < small) {
                small = nums[i];
            }
            if (nums[i] > large) {
                large = nums[i];
            }
        }

       
        if (small > 0) {
            missingNumber = 0;
        } else {
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

       
        if (!check) {
            if (large == 0) {
                return 1; 
            } else {
                return missingNumber;
            }
        } else {
            return large + 1;
        }
    }
 
    }
