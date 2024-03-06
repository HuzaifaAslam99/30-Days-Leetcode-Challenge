import java.util.ArrayList;
public class RemoveSortedList {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        int [] list = {2,3,1,3,4,5,6,2,3,4,5,6,7,77,};
        
        for (int i=0; i<list.length; i++){
            array.add(list[i]);
        }

        for (int i=0; i<array.size(); i++){
            for (int j=i+1; j<array.size(); j++){
                if (array.get(i).equals(array.get(j))){
                 array.remove(j);
                }
            }
        }
 System.out.println(array);
    }
}
