package HHH_ObjectsandClasses_Built_in_7;

import java.math.BigInteger;
import java.util.Scanner;

public class b_SumBigNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        BigInteger firstBigInteger= new BigInteger(scanner.nextLine());
        BigInteger secondBigInteger= new BigInteger(scanner.nextLine());

        BigInteger sum=firstBigInteger.add(secondBigInteger);

        System.out.println(sum);


    }
}
