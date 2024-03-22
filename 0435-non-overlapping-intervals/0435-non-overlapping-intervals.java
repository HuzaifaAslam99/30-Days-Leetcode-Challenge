import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       if (intervals == null || intervals.length == 0) {
            return 0;
        }
        
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]);
            }
        });
        
        int count = 1; 
        int end = intervals[0][1]; 
        
        for (int i = 1; i < intervals.length; i++) {
      
            if (intervals[i][0] < end) {
                continue;
            }
            
            end = intervals[i][1];
            count++;
        }
        
        int removeCount = intervals.length - count;
        
        return removeCount;
    }
}