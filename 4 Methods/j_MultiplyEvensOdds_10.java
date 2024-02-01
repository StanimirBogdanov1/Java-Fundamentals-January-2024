package D_Methods_4;

import java.util.Scanner;

public class j_MultiplyEvensOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int inputNumber=Integer.parseInt(scanner.nextLine());

        if(inputNumber<0){
            inputNumber=Math.abs(inputNumber);
        }

        int result=getMultipleOfEvensAndOdds(inputNumber);
        System.out.println(result);

    }



    public static int getMultipleOfEvensAndOdds(int inputNumber){

        int sumOfEvenNums=getEvenSum(inputNumber);
        int sumOfOddnums=getOddSum(inputNumber);

        int sum=sumOfEvenNums*sumOfOddnums;
        return sum;


    }


    public static int getEvenSum(int inputNumber){

        String numberLength=inputNumber+"";

        int sumEvenNum=0;
        for(int symbol=0;symbol<numberLength.length();symbol++){
            int number=Integer.parseInt((numberLength.charAt(symbol))+"");

            if(number%2==0){
                sumEvenNum+=number;
            }
        }
        return sumEvenNum;

    }

    public static int getOddSum(int inputNumber){

        String numberLength=inputNumber+"";

        int sumOddNum=0;
        for(int symbol=0;symbol<numberLength.length();symbol++){
            int number=Integer.parseInt((numberLength.charAt(symbol))+"");

            if(number%2==1){
                sumOddNum+=number;
            }
        }
        return sumOddNum;

    }




}
