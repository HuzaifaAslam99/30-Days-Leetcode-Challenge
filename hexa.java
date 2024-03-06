public class hexa {
    public static void main(String[] args) {
        StringBuilder sum = new StringBuilder(); 

        String a = "111AB7";
        String b = "11156F";

        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        int digitA = 0;
        int digitB = 0;
        boolean ShouldBreak = false;

        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                if ('0' <= a.charAt(i) && a.charAt(i) <= '9') {
                    digitA = a.charAt(i--) - '0';
                } else {
                    digitA = a.charAt(i--) - 55;
                    ShouldBreak = (digitA > 15);
                    if (ShouldBreak) {
                        break;
                    }
                }
            }

            if (j >= 0) {
                if ('0' <= b.charAt(j) && b.charAt(j) <= '9') {
                    digitB = b.charAt(j--) - '0';
                } else {
                    digitB = b.charAt(j--) - 55;
                    ShouldBreak = (digitB > 15);
                    if (ShouldBreak) {
                        break;
                    }
                }
            }
            
            int total = digitA + digitB + carry;
            int remainder = total % 16;

            if (remainder >= 10) {
                char digitF = (char)(remainder + 55);
                sum.insert(0, digitF);
            } else {
                sum.insert(0, remainder);
            }
            
            carry = total / 16;
        }

        if (ShouldBreak) {
            System.out.println("Wrong Input");
        } else {
            System.out.println(sum);
        }
    }
}
