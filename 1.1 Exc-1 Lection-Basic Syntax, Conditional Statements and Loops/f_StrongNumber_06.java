package AA_BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class f_StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String inputNumber=scanner.nextLine();

        int sumOfFactorial=0;

        for(int position=0;position<inputNumber.length();position++){
            char symbol=inputNumber.charAt(position);
          int symbolAsInt=Integer.parseInt(symbol+"");

          // int numberAsInt =Integer.parseInt(inputNumber.charAt(i)+"");

            int factorial=1;
            for(int i=2;i<=symbolAsInt;i++){
                factorial*=i;
            }
            sumOfFactorial=sumOfFactorial+factorial;

        }

        String resultAsString=sumOfFactorial+"";
        if(inputNumber.equals(resultAsString)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
