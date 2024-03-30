class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int maxLength = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        
        for (int start = 0, end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }
            maxLength = Math.max(maxLength, end - start + 1);
            charIndexMap.put(currentChar, end);
        }
        
        return maxLength;
    }
}