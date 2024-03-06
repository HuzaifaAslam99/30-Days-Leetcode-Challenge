import java.util.Scanner;
public class RomanToInt {
    static int logic (String R, int L){
        int num = 0;
        int check = -1;

        for (int i=0; i<L; i++){

            if (R.charAt(i)=='I'){
                if ((check<=1000 && check>=1) || check==-1){
                if ((R.charAt(i+1)=='V')){
                   num +=4;
                   check=4;
                    i++;}
                else if ((R.charAt(i+3)=='I')) {
                    System.out.println("Wrong Input");
                    break;}
                else {
                    num+=1;
                    check=1;
                }}
                else{
                     System.out.println("Wrong Input");
                     break;
                      }
                        // check=1;
            }


            else if (R.charAt(i)=='V'){
                if ((check<=1000 && check>=5) || check==-1 ){
                num += 5;}
                else{
                    System.out.println("Wrong Input");
                break;}
                    check=5;

            }  

            else if (R.charAt(i)=='X'){
                if ((check<=1000 && check>=10) || check==-1 ){
                num += 10;}
                else{
                    System.out.println("Wrong Input");
                    break;
                }
            }

            else if (R.charAt(i)=='L'){
                if ((check<=1000 && check>=50) || check==-1 ){
                num += 50;}
                else{
                    System.out.println("Wrong Input");
                }
                check = 50;
            }

            else if (R.charAt(i)=='C'){
                if ((check<=1000 && check>=100) || check==-1){
                num += 100;}
                else {
                    System.out.println("Wrong Input");
                    break;
                }
                check=100;
            }

            else if (R.charAt(i)=='D'){
                if ((check<=1000 && check>=500) || check==-1 ){
                num += 500;}
                else{
                    System.out.println("Wrong Input");
                    break;
                }
                check=500;
            }

            else if (R.charAt(i)=='M'){
                if (check==-1 || check==1000){
                    num += 1000;
                }
                else{
                    System.out.println("Wrong Input");
                    break;
                }
                // num += 1000;
                check=1000;
            }

            else{
                System.out.println("Wrong Input");
                break;
            }
        }
        return num;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Roman Number : ");
        String roman = input.next();
        int length = roman.length();

        int integer = logic(roman,length);
        System.out.println(integer);

    }
}
