public class IXI {
    public static void main(String[] args) {
        String n = "IX";
        int m = 0;
        boolean check = false;

        for (int i=0; i<n.length(); i++){
            // if (n.charAt(0) =='X'){
            //     m=i;              
            //     break;
            // }
            if (n.charAt(i) =='X'){    
                m=i;              
                break;
            }
        }
    // if (n.length()-1==m){
    //     m = n.length();
    // }
    // if (m==0){
    //     m = n.length()+1;
    // }


        for (int i=m; i<n.length()-1; i++){
            // if (m==0){
            //     break;
            // }
            if (n.charAt(i+1)=='I' && n.charAt(i-1)=='I' && n.charAt(i)=='X'){
                check=true;
                break;
            }
            // System.out.println("k");
        }
if (check){
    System.out.println("Wrong Input");
}
else{
    System.out.println("Correct Input");
}  
    }
}
