package DD_MethodsExercise_4_1;

import java.util.Scanner;

public class g_NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        int number=Integer.parseInt(scanner.nextLine());

        printMatrix(number);

    }

    public static void printMatrix(int number){

        for(int row=0;row<number;row++){
            for(int col=0;col<number;col++){
                System.out.print(number+" ");
            }
            System.out.println();
        }



    }
}
