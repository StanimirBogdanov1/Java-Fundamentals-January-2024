package BB_DataTypesAndVariablesExercise_2_1;

import java.util.Scanner;

public class d_SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int input =Integer.parseInt(scanner.nextLine());


        int sum=0;
        for(int i=0;i<input;i++){
            char symbols=scanner.nextLine().charAt(0);

            sum+=symbols;

        }

        System.out.printf("The sum equals: %d",sum);

    }
}
