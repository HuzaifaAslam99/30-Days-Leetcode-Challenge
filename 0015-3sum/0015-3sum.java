class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> Final = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
            int ptr1 = i + 1, ptr2 = nums.length - 1, target = -nums[i];
            while (ptr1 < ptr2) {
               if (nums[ptr1] + nums[ptr2] == target) {
                  Final.add(Arrays.asList(nums[i], nums[ptr1], nums[ptr2]));
                  while (ptr1 < ptr2 && nums[ptr1] == nums[ptr1 + 1]) ptr1++; 
                  while (ptr1 < ptr2 && nums[ptr2] == nums[ptr2 - 1]) ptr2--; 
                    ptr1++;
                    ptr2--;
                  } else if (nums[ptr1] + nums[ptr2] < target) {
                        ptr1++;
                  } else {
                        ptr2--;
                  }
                }
            }
        }
        return Final;

     
    }
}