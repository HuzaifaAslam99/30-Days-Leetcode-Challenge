class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; 
        int p2 = n - 1;
        int p = m + n - 1; // Pointer for the merged array
        
        // Merge from the end of nums1 and nums2
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1]; // Place larger element at the end of nums1
                p1--;
            } else {
                nums1[p] = nums2[p2]; // Place larger element at the end of nums1
                p2--;
            }
            p--;
        }
        
        // If there are remaining elements in nums2, copy them to nums1
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}