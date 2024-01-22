package B_DataTypesAndVariables_2;

import java.util.Scanner;

public class l_RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int inputNumber = Integer.parseInt(scanner.nextLine());
//
//
//
//        boolean isTrueOrFalse = false;
//        for (int numbers = 1; numbers <=inputNumber; numbers++) {
//
//            int symbolNumber = numbers;
//
//
//            int sum = 0;
//
//            while (symbolNumber > 0) {
//                sum += symbolNumber % 10;
//                symbolNumber = symbolNumber / 10;
//            }
//
//            if( (sum == 5) || (sum == 7) || (sum == 11)){
//                isTrueOrFalse=true;
//            }else{
//                isTrueOrFalse=false;
//            }
//
//            String trueOrFalseAnswer="";
//            if(isTrueOrFalse) {
//                trueOrFalseAnswer="True";
//                System.out.printf("%d -> %s%n", numbers, trueOrFalseAnswer);
//            }else{
//                trueOrFalseAnswer="False";
//                System.out.printf("%d -> %s%n", numbers, trueOrFalseAnswer);
//            }
//
//
//        }


        int inputNumber = Integer.parseInt(scanner.nextLine());


        for (int numbers = 1; numbers <= inputNumber; numbers++) {

            int symbolNumber = numbers;


            int sum = 0;

            while (symbolNumber > 0) {
                sum += symbolNumber % 10;
                symbolNumber = symbolNumber / 10;
            }

            String trueOrFalseAnswer = "";
            if ((sum == 5) || (sum == 7) || (sum == 11)) {
                trueOrFalseAnswer = "True";
                System.out.printf("%d -> %s%n", numbers, trueOrFalseAnswer);
            } else {
                trueOrFalseAnswer = "False";
                System.out.printf("%d -> %s%n", numbers, trueOrFalseAnswer);
            }


        }
    }
}
