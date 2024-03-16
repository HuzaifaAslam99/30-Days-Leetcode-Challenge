class Solution {
    public boolean isPerfectSquare(int num) {
               if (num < 0) {
            return false;
        }

        // Iterate up to the square root of the number
        for (long i = 0; i * i <= num; i++) {
            // Check if the square of the current iteration is equal to the number
            if (i * i == num) {
                return true;
            }
        }

        return false;
    
    }
}