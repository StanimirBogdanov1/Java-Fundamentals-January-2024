package BB_DataTypesAndVariablesExercise_2_1;

import java.util.Scanner;

public class a_IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numberOne=Integer.parseInt(scanner.nextLine());
        int numberTwo=Integer.parseInt(scanner.nextLine());
        int numberThree=Integer.parseInt(scanner.nextLine());
        int numberFour=Integer.parseInt(scanner.nextLine());

        int result= (((numberOne+numberTwo)/numberThree)*numberFour);

        System.out.println(result);


    }
}
