import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
             Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
       
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        
       
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }
        
      
        int[] result = new int[k];
        int i = k - 1;
        while (!minHeap.isEmpty()) {
            result[i--] = minHeap.poll().getKey();
        }

        return result;
}
}