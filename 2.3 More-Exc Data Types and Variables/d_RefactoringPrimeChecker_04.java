package BBB_DataTypesandVariablesMoreExercise_2_2;

import java.util.Scanner;

public class d_RefactoringPrimeChecker_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);



        int endInput = Integer.parseInt(scanner.nextLine());

        for (int startNum = 2; startNum <= endInput; startNum++) {
            boolean isRealOrNot = true;
            for (int numbers=2; numbers < startNum; numbers++) {
                if (startNum % numbers == 0) {
                    isRealOrNot = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", startNum, isRealOrNot);
        }


    }
}
