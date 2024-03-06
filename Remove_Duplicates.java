import java.util.ArrayList;

public class Remove_Duplicates {
    public static void main(String[] args) {

    ArrayList<Integer> array = new ArrayList<>();

        int [] num = {1,1,2,5,6,7,6,5,7,77,665,343,8,9,0,0,0};
        // array.add();
        int [] a = {};
    //    for (int i=0; i<num.length; i++){
    //     if (!array.contains(num[i])){
    //         array.add(num[i]);
    //     }
    //    }

    for (int i=0; i<num.length; i++){
        boolean Duplicate = false;
        for (int j=0; j<array.size(); j++){
            if (num[i]==array.get(j)){
                // array.add(num[i]);

                Duplicate = true;
                break;

            }
        }
        if (Duplicate==false) {
            array.add(num[i]);
            int z=0;
        }
      
       }
       
System.out.println(array);
    }
}



