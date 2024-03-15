package J_J_ExerciseTextProcessing_9_1;

import java.math.BigInteger;
import java.util.Scanner;

public class e_MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String firstNumber=scanner.nextLine();
        String secondNumber=scanner.nextLine();

        BigInteger firstNum= new BigInteger(firstNumber);
        BigInteger secondNum= new BigInteger(secondNumber);

        System.out.println(firstNum.multiply(secondNum));

    }
}
