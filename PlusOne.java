import java.util.ArrayList;
public class PlusOne{
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        int [] list1 = {99,89,89};
        String store = "";
    

        for (int i=0; i<list1.length; i++){
            store += Integer.toString(list1[i]);
        }
        int newstore = Integer.parseInt(store)+1;
        String finalstring = Integer.toString(newstore);

        for (int i=0; i<finalstring.length(); i++){
               int final1 = Character.getNumericValue(finalstring.charAt(i));
               array.add(final1);
        }
 
        
System.out.println(array);
    }
}