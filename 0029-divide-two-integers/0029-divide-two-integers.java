class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; 
        }
        
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        
        long dividendL = Math.abs((long)dividend);
        long divisorL = Math.abs((long)divisor);
        
        long quotient = 0;
        
        while (dividendL >= divisorL) {
            long temp = divisorL, multiple = 1;
            while (dividendL >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dividendL -= temp;
            quotient += multiple;
        }
        
        quotient = sign == 1 ? quotient : -quotient;
        
        if (quotient > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (quotient < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        
        return (int)quotient;
    }
}