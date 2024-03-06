import java.util.ArrayList;
public class Remove {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        int [] list1 = {1,3,4,6,7,2,3,6,4,2};
        int n = 3;
        for (int i=0; i<list1.length; i++){
            array.add(list1[i]);
        }
        for (int i=0; i<array.size(); i++){
            if (n==array.get(i)){
                array.remove(i);
            }
        }
        System.out.println(array);
    }
}
