public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] list1 = {"flo","flower","flow","flowht","flo","floll"};

    String first = list1[0];
    int i=1;
    while (i<list1.length){

        String store = "";
        for (int j=0; j < first.length() && j < list1[i].length(); j++){
            char character1 = first.charAt(j);
            char character2 = list1[i].charAt(j);
            if (character1==character2){
                store+=character1;
            }
            else{
                break;
            }
        }
        first=store;
        i++;
    }
    
if (first==""){
    System.out.println("{}");
}
else{
System.out.println(first);
}

    }
}
