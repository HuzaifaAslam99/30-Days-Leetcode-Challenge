class Solution {
    public boolean isPalindrome(int number) {

        String copyNumber = Integer.toString(number);
        String reverse = "";
        int length = copyNumber.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse += copyNumber.charAt(i);
        }

      
    return copyNumber.equals(reverse);



    }
}