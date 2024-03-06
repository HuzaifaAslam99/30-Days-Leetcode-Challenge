public class maximum {
    public static void main(String[] args) {
        String [] list1 = {"flower","flowuuuuuuuu","flowht","flo","jk90plll"};
        // int length = list1.length;
        
        String store = "";
        String a = "";
        int sum = list1[0].length();


        for (int i=1; i<list1.length;i++){
            int LengthString = list1[i].length();
            if (sum<=LengthString){
             sum = LengthString;
             a = list1[i];
            }
       }

System.out.println(a);
}
}