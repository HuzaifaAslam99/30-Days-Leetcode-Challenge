public class AddBinary2 {
    public static void main(String[] args) {
        String a = "1110100";
        String b =     "1011";
        int Len_a = a.length();
        int Len_b = b.length();
        String longest = a;
        String shortest = b;



        // for (int i=0; i<a.length(); i++){
            if (Len_a>=Len_b){
                longest= a;
                shortest=b;
                }
            else {
                longest=b;
                shortest=a;
            }
// System.out.println(longest);

       String sum = "";
       int carry = 0;
       int lenL = longest.length();
       int lenS = shortest.length();
 
       int i=0;

        for (i=lenL-1; i>=lenL-lenS; i--){
            char long_ = longest.charAt(i);
            char short_ = shortest.charAt(i);

             if (long_=='1' && short_=='1'){
                if (carry==1){
                    sum += "1";
                    carry = 1;
                }
                else{
                      sum += "0"; 
                      carry += 1;
                    }                   
             }

             else if (long_=='0' && short_=='0'){
                if (carry == 1){
                    sum += "1";
                    carry = 0;
                }
                else{
                sum += "0";
                    }
             }
             else { 
                if (carry==1){
                    sum += "0";
                    carry = 1;
                }
                else{
                sum += "1";
                carry = 0;
            }

             }
        
        }
if (lenL != lenS){
        for (int k=lenL-lenS-1; k>-1; k--){
            if (carry==1){
                if (longest.charAt(k)=='1'){
                    sum +="1";
                    carry = 1;
                }
                else{
                    sum += "1";
                    carry = 0;
                }
                
            }
            else {
                sum += longest.charAt(k);
            }
        }
    }
String finals = "";
    for (int m=sum.length(); m>-1; m--){
         finals += sum.charAt(i);
    }
System.out.println(finals);
    }
}
