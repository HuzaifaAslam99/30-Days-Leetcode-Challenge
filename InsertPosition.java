public class InsertPosition {
public static void main(String[] args) {
    int [] list1 = {5,7,8,9,0,8,7,0,8};
    int n = 0;
    int i = 0;
    for (i=0; i<list1.length;i++){
        if (list1[i]==n){
            break;
        }
    }
    System.out.println(i);
}
}
