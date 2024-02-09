package DD_MethodsExercise_4_1;

import java.util.Scanner;

public class e_AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOne=Integer.parseInt(scanner.nextLine());
        int numberTwo=Integer.parseInt(scanner.nextLine());
        int numberThree=Integer.parseInt(scanner.nextLine());

        int sumResult=sumFirstAndSecondNum(numberOne,numberTwo);

        substractSumAndThirdNum(sumResult,numberThree);

    }

    // method that sums the first two numbers
    public static int sumFirstAndSecondNum(int numberOne,int numberTwo){

        return numberOne+numberTwo;

    }

    // method that subtracts the sum with the third number
    public static void substractSumAndThirdNum(int sumResult, int numberThree){

        int result=sumResult-numberThree;
        System.out.println(result);

    }

}
