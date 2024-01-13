package AA_BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class h_TriangleOfNumbers_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int input=Integer.parseInt(scanner.nextLine());

        for(int row=1;row<=input;row++){

            for(int col=1;col<=row;col++){
                System.out.print(row+" ");
            }

            System.out.println();
        }

    }
}
