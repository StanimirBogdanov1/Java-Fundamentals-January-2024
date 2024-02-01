package D_Methods_4;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //this is with Arrays method
        // the second example has no arrays
        int inputNumber=Integer.parseInt(scanner.nextLine());


        if(inputNumber<0){
            inputNumber=Math.abs(inputNumber);
        }
        String intToString=inputNumber+"";
        char[] stringToCharArr=intToString.toCharArray();



        int result=getMultipleOfEvensAndOdds(stringToCharArr);
        System.out.println(result);

    }



    public static int getMultipleOfEvensAndOdds(char[] stringToCharArr){

        int sumOfEvenNums=getEvenSum(stringToCharArr);
        int sumOfOddnums=getOddSum(stringToCharArr);

        int sum=sumOfEvenNums*sumOfOddnums;
        return sum;


    }


    public static int getEvenSum(char[] stringToCharArr){

        int sumEvenNum=0;
        for(int i=0;i<stringToCharArr.length;i++){
            int numberIndex=Integer.parseInt(stringToCharArr[i]+"");
            if(numberIndex%2==0){
                sumEvenNum+=numberIndex;
            }
        }
        return sumEvenNum;

    }

    public static int getOddSum(char[] stringToCharArr){

        int sumOddNum=0;
        for(int i=0;i<stringToCharArr.length;i++){
            int numberIndex=Integer.parseInt(stringToCharArr[i]+"");
            if(numberIndex%2==1){
                sumOddNum+=numberIndex;
            }
        }
        return sumOddNum;

    }





}
