public class AddBinary {
    public static void main(String[] args) {
        String a = "1110100";
        String b =    "1111";

        StringBuilder sum = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = (i >= 0) ? a.charAt(i--) -'0': 0;
            int digitB = (j >= 0) ? b.charAt(j--) -'0': 0;
            int total = digitA + digitB + carry;
            sum.insert(0, total % 2);
            carry = total / 2;
        }

        System.out.println(sum.toString());
    }
}


