public class MyBinaryAdd {
    public static void main(String[] args) {
        StringBuilder sum = new StringBuilder();
        // String sum = "";
        String a = "101";
        String b = "100";

        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        // int digitA =0;

        while (i>=0 || j>=0 || carry!=0){
            int digitA = (i>=0) ? a.charAt(i--)-'0' : 0;
            int digitB = (j>=0) ? b.charAt(j--)-'0' : 0;
            int total = digitA+digitB+carry;
            sum.insert(0,total%2);
            carry = total/2; 
        }
System.out.println(sum.toString());
    }
}
