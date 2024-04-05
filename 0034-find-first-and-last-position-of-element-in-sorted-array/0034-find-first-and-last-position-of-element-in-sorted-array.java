class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        
        // Find the first occurrence of the target
        int start = findFirstOccurrence(nums, target);
        if (start == -1)
            return result; // Target not found
        
        // Find the last occurrence of the target
        int end = findLastOccurrence(nums, target);
        
        result[0] = start;
        result[1] = end;
        return result;
    }
    
    private int findFirstOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int firstOccurrence = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                firstOccurrence = mid;
                high = mid - 1; // Continue searching towards the left
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return firstOccurrence;
    }
    
    private int findLastOccurrence(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int lastOccurrence = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                lastOccurrence = mid;
                low = mid + 1; // Continue searching towards the right
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return lastOccurrence;
    }
}
