package J_TextProcessing_9;

import java.util.Scanner;

public class e_DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String input =scanner.nextLine();

        int inputLength=input.length();

        StringBuilder sbIsDigit=new StringBuilder();
        StringBuilder sbIsLetter=new StringBuilder();
        StringBuilder sbIsSymbol=new StringBuilder();

        for(int symbol=0;symbol<inputLength;symbol++){
            char[] symbolsInputArr=input.toCharArray();
            char currentSymbol=symbolsInputArr[symbol];

            if(Character.isDigit(currentSymbol)){
                sbIsDigit.append(currentSymbol);
            }else if(Character.isLetter(currentSymbol)){
                sbIsLetter.append(currentSymbol);
            }else if(!Character.isLetterOrDigit(currentSymbol)){
                sbIsSymbol.append(currentSymbol);
            }

        }

        System.out.println(sbIsDigit.toString());
        System.out.println(sbIsLetter.toString());
        System.out.println(sbIsSymbol.toString());


    }
}
