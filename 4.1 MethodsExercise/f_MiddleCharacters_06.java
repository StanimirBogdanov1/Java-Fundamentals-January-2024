package DD_MethodsExercise_4_1;

import java.util.Scanner;

public class f_MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String inputText=scanner.nextLine();

        int textLength=inputText.length();

        if(textLength%2==0){
            middleCharactersEvenString(inputText);
        }else{
            middleCharactersOddString(inputText);
        }


    }

    public static void  middleCharactersEvenString(String inputText){

        char[] inputTextToCharArr=inputText.toCharArray();

        int charArrLength=inputTextToCharArr.length/2;

        System.out.print(inputTextToCharArr[charArrLength-1]);
        System.out.println(inputTextToCharArr[charArrLength]);


    }
    public static void middleCharactersOddString(String inputText){

        char[] inputTextToCharArr=inputText.toCharArray();

        int charArrLength=inputTextToCharArr.length/2;

        System.out.print(inputTextToCharArr[charArrLength]);

    }


}
