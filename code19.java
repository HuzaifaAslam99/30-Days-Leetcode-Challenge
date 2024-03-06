
public class code19 {
   static int logic (int x, int y){
        // int x=50;
        int z;
        if (x>y){
           z = x-y;
        }
        else {
          z = y-x;
        }
        // int z;
        //  x=50;

        // int t = z;
        return z;
        // System.out.println(z);
    }
    public static void main (String[] arg){
        // code19 obj = new code19();
        int a;
        a = 5;
        int b;
        b = 10;
        // int c = obj.logic(a,b);
        int c = logic(a,b);

        System.out.println(c);

    }
}