public class RomanToInteger{
    
    static int romanToInt (String roman){

    String Integer = "";
    char [] RomanList = {'I','V','X','L','C','D','M'};
    int [] IntegerList = {1,5,10,50,100,500,1000};
    int lengthRoman = roman.length();
    // char RomanList[0] = '1';

    int length = RomanList.length;

    for (int i=0; i<length; i++){
        for (int j=0; j<length; j++){
            if (i==j);
            RomanList[i] = (char)(IntegerList[j]);
        }
    }

}


    public static void main(String[] args){

        String roman = "III" ;
        int integer = romanToInt(roman);

       

        
    }
}