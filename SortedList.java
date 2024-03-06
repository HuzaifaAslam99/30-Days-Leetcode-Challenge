
import java.util.ArrayList;
public class SortedList {
    public static void main(String[] args) {
        
    
    ArrayList<Integer> array = new ArrayList<>();
    ArrayList<String> array1 = new ArrayList<>();

    // ArrayList<Integer> array = new ArrayList<>();

    
    // int [] list1 = {1,2,3,4,5};
    // int [] list2 = {1,2,3,4,5};

    int [] list1 = {};
    int [] list2 = {1,2,3,4,5};
    
    int length1 = list1.length;
    // System.out.println(length1);
    int length2 = list2.length;

    for (int i=0; i<length1; i++){
        array.add(list1[i]);
    }
    for (int j=0; j<length2; j++){
        array.add(list2[j]);
    }

    System.out.println(array);


    String [] list3 = {"op","kl","pp"};
    String [] list4 = {"op","lll","kjl"};
    
    int length3 = list3.length;
    int length4 = list4.length;

    for (int k=0; k<length3; k++){
        array1.add(list3[k]);
    }
    for (int m=0; m<length4; m++){
        array1.add(list4[m]);
    }

    System.out.println(array1);


    }
}
