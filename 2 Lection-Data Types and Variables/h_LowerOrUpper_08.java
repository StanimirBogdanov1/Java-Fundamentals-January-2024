package B_DataTypesAndVariables_2;

import java.util.Scanner;

public class h_LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);



//        char letter=scanner.nextLine().charAt(0);
//
//        String upperOrLower="";
//
//        if(letter>=97 && letter<=122){
//            upperOrLower="lower-case";
//        }else if(letter>=65 && letter<=90){
//            upperOrLower="upper-case";
//        }
//
//
//        System.out.println(upperOrLower);




        char letter=scanner.nextLine().charAt(0);

        String upperOrLower="";

        if(Character.isLowerCase(letter)){
            upperOrLower="lower-case";
        }else if(Character.isUpperCase(letter)){
            upperOrLower="upper-case";
        }


        System.out.println(upperOrLower);

    }
}
