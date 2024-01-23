package AAA_BasicSyntaxConditionalStatementsAndLoopsMoreExercise_1_3;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String input =scanner.nextLine();

       char lastSymbol=input.charAt(input.length()-1);
       String charToString = String.valueOf(lastSymbol);
       int stringToInt= Integer.parseInt(charToString);

       String result= lastInt(stringToInt);
        System.out.println(result);

    }

    public static String lastInt (int lastInt){

        String nameOfDigit="";
        if(lastInt==0){
            nameOfDigit="zero";
        }else if(lastInt==1){
            nameOfDigit="one";
        }else if(lastInt==2){
            nameOfDigit="two";
        }else if(lastInt==3){
            nameOfDigit="three";
        }else if(lastInt==4){
            nameOfDigit="four";
        }else if(lastInt==5){
            nameOfDigit="five";
        }else if(lastInt==6){
            nameOfDigit="six";
        }else if(lastInt==7){
            nameOfDigit="seven";
        }else if(lastInt==8){
            nameOfDigit="eight";
        }else if(lastInt==9){
            nameOfDigit="nine";
        }
        return nameOfDigit;


    }
}
