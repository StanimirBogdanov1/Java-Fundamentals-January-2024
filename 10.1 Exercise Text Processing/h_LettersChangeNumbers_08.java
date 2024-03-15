package J_J_ExerciseTextProcessing_9_1;

import java.util.Scanner;

public class h_LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String[] inputArr=scanner.nextLine().split("\\s+");


        double sum=0.00;
        for(String elementText: inputArr){

            double result=textOperation(elementText);

            sum+=result;

        }


        System.out.printf("%.2f",sum);

    }

    private static double textOperation(String elementText) {

        char beforeSymbol=elementText.charAt(0);
        int numberForOperations=Integer.parseInt(elementText.substring(1,elementText.length()-1));
        char afterSymbol=elementText.charAt(elementText.length()-1);

        double res=numberForOperations;

        if(Character.isUpperCase(beforeSymbol)){
            res /= beforeSymbol-64;
        }else if(Character.isLowerCase(beforeSymbol)){
            res*=beforeSymbol-96;
        }

        if(Character.isUpperCase(afterSymbol)){
            res-=afterSymbol-64;
        }else if(Character.isLowerCase(afterSymbol)){
            res+=afterSymbol-96;
        }


        return res;

    }
}
