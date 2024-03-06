import java.util.ArrayList;
public class leetcode2 {
public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<>();

    // int [] list1 = {9,8,0};
    // int [] list2 = {8,0,4};
    int [] list1 = {9,3,5,6};
    int [] list2 = {9,9,9,9};

    // int [] list1 = {9,8,0};
    // int [] list2 = {9,2,4};


    int length1 = list1.length;
    int length2 = list2.length;

 String string = "";

 boolean check = false;
 int sum = 0;

 int i = 0;
//  int m = 0;

 for ( i=0; i<length1; i++ ){   
    for (int j=0; j<length2; j++){
        if (i==j){
           if (check==true){
            sum = list1[i] + list2[j]+1;
           }
          
           else{
             sum = list1[i] + list2[j];}
            if (sum>9){
            
            int n=1;
            while (n>0){
              int digit = sum % 10;
              array.add(digit);
              n-=1;
              check = true;}}
        else {
           array.add(sum);
           check=false;
            
        }}          
// }   
//  }

// else {
//     if (check==true){
//     if (length1>length2){   
//         for (int m=i+1; m<length1; m++){
//         array.add(list1[m]);
//         // System.out.println(list1[m]);
//     }}
//     else{
//         for (int m=i+1; m<length2; m++){
//             // array.add(list2[m]);
//         }
//     }}

    //  else{
    //     if (length1>length2){   
    //         for (m=i+1; m<length1; m++){
    //         array.add(list1[m]);}}
    //     else{
    //         for (m=i+1; m<length2; m++){
    //             array.add(list2[m]);}
    //     }
    //  }}
    // }

//     else {
//     if (check==true){
//     if (length1>length2){   
//         for (int m=i+1; m<length1; m++){
//         array.add(list1[m]);
//         // System.out.println(list1[m]);
    // }
// }
// }
}
 }
System.out.println(array);

}
}
