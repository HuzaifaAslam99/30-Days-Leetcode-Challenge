
public class MergeDescending {

    public static void main(String[] args) {
       
        int [] list1 = {1,3,6,5};
        int [] list2 = {1,3,6,5};
        boolean check = false;
        
        if (list1.length!=list2.length){
        check = true;
        }     
        else{
        for (int i=0; i<list1.length; i++){
                
                if (list1[i]!=list2[i]){
                    check = true;
                    break;
                }
            }
        }
if (check){
    System.out.println("Not Matched");
}
else{
    System.out.println("Yes Matched");
}
    }
}
