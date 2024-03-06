public class LastWordLength {
    public static void main(String[] args) {
        String s = "0uzaifa";
        String store = "";
        boolean check = false;

        for (int i=s.length()-1; i>-1; i-- ){
            if (s.charAt(i)==' '){
                for (int j=i+1; j<s.length(); j++){
                    store += s.charAt(j);
                    check=true;
                }
                break;
            }   
        }

        if (check==false){
            store=s;
        }

        System.out.println(store);
        System.out.println(store.length());

    }
}
