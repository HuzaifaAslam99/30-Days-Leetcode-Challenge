import java.util.ArrayList;
public class leetcode1 {
public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<>();

    int [] list1 = {8,8,0};
    int [] list2 = {1,0,0,5};

    int length1 = list1.length;
    int length2 = list2.length;
    String s1 = "";
    String s2 = "";

    for (int i=0; i<length1; i++ ){
       s1+=Integer.toString(list1[i]);
    }
    for (int j=0; j<length2; j++){
       s2+=Integer.toString(list2[j]);           
    }

    int int1 = Integer.parseInt(s1);
    int int2 = Integer.parseInt(s2);
 
    int sum = int1+int2;

    String string = "";
    while (sum>0){
        int digit = sum % 10;
        string += Integer.toString(digit);
        sum = sum/10;
    }
    int integer = Integer.parseInt(string); 
    while (integer>0){
        int digit = integer % 10;
        array.add(digit);
        integer = integer/10;
    }

    System.out.println(array);

}

}
