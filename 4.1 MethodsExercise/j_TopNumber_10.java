package DD_MethodsExercise_4_1;

import java.util.Scanner;

public class j_TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int inputNumber =Integer.parseInt(scanner.nextLine());

        for(int i=1;i<=inputNumber;i++){

           boolean isValidSumDigits= sumOfDigitsDivisibleByEights(i);
           boolean doesContainsOddDigits=leastoneOddDigit(i);

            if(isValidSumDigits){
                if(doesContainsOddDigits) {
                    System.out.println(i);
                }
            }

        }

    }

    public static boolean sumOfDigitsDivisibleByEights(int number){

        String numberAsText=number+"";
        int numberLength=numberAsText.length();


        int sum=0;
        for(int index=0;index<numberLength;index++){

            int symbol=Integer.parseInt(numberAsText.charAt(index)+"");

            sum+=symbol;
        }

        if(sum%8==0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean leastoneOddDigit(int number){

        while(number>0){

            int lastDigit=number%10;

            if(lastDigit%2 !=0){
                return true;
            }
            number /=10;

        }

        return false;

    }




}
