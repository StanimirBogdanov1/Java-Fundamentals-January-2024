package B_DataTypesAndVariables_2;

import java.util.Scanner;

public class a_ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int meters=Integer.parseInt(scanner.nextLine());

        double  kilometers = meters/1000.0;

        System.out.printf("%.2f",kilometers);



    }
}
