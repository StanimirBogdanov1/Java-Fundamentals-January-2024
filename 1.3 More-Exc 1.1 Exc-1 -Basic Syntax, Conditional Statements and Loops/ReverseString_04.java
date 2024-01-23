package AAA_BasicSyntaxConditionalStatementsAndLoopsMoreExercise_1_3;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input =scanner.nextLine();

        int inputLenght=input.length();
        String reverseInput="";

        for(int i=0; i<inputLenght;i++){
            char symbolInput=input.charAt(i);

            reverseInput=symbolInput+reverseInput;

        }

        System.out.println(reverseInput);

    }
}
