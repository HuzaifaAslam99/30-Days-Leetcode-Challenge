import java.util.*;
class Solution {

           private static final String[] DIGIT_LETTERS = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtrack(result, "", digits, 0);
        return result;
    }
    
    private void backtrack(List<String> result, String current, String digits, int index) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        String letters = DIGIT_LETTERS[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            backtrack(result, current + letter, digits, index + 1);
        } 
    }
}