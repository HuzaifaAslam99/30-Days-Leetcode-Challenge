public class IndexString {
    public static void main(String[] args) {
        String string = "hello";
        String substring = "lo";
        boolean check = false;
        int i=0;

        for ( i=0; i<=string.length()- substring.length(); i++){
              if (string.charAt(i)==substring.charAt(0)){
                check = true;
                for (int j=0; j<substring.length(); j++){
                    if (string.charAt(i+j) !=substring.charAt(j)){
                    check=false;
                    break;}
                }
            }
        
              
              if (check) {
                break;}
              }
            

        if (!check){
            System.out.println("Substring doesnt exist in String");}
        else{
             int a = i;
             System.out.printf("Index is %d",a);}
        
}
}