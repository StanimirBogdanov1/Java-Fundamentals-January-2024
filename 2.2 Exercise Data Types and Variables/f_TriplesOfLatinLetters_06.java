package BB_DataTypesAndVariablesExercise_2_1;

import java.util.Scanner;

public class f_TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int input=Integer.parseInt(scanner.nextLine());

        for(int start=97;start<=97+input-1;start++){

            for(int start2=97;start2<=97+input-1;start2++){

                for(int start3=97;start3<=97+input-1;start3++){

                    System.out.println(""+(char)start + (char)start2 + (char)start3);
                }


            }


        }


    }
}
