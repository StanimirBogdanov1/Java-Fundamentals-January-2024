package B_DataTypesAndVariables_2;

import java.math.BigDecimal;
import java.util.Scanner;

public class b_PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        BigDecimal pounds = new BigDecimal(scanner.nextLine());

        double oneUsDolar=1.36;

        BigDecimal pountToUsDolars=pounds.multiply(BigDecimal.valueOf(oneUsDolar));


        System.out.printf("%.3f",pountToUsDolars);

    }
}
