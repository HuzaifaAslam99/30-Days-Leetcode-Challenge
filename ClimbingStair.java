public class ClimbingStair {
    public static void main(String[] args) {
        int n = 6;
        int sum = 1;
        int sum1 = 1;
        int sum2 = 0; 
        for (int i=2; i<n+2; i++){

          sum = sum1 + sum2;
          sum2 = sum1;
          sum1 = sum;
          
        }     
        if (n==0){
            sum = 0;
        } 
        else  if (n==1 || n==2){
            sum = 1;
        }
        System.out.println(sum); 
    }
}
