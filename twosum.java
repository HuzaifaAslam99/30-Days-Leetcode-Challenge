public class twosum {
    public static void main(String[] args) {
        int n = 5;
        int [] list = {1,2,4,6,9};
        for (int i=0; i<list.length;i++){
            for (int j=0; j<list.length;j++){
                if (list[i]>list[j]){
                if (list[i]+list[j]==n){
                    System.out.printf("[%d,%d]",i,j);}
                    
                }
            }

        }          
    }
}
