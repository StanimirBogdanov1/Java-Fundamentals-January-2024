package HHH_ObjectsandClasses_Built_in_7;

import java.math.BigInteger;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numberOne=Integer.parseInt(scanner.nextLine());

        String numberTwo=scanner.nextLine(); // този текст като число го направи мн дълъг

        BigInteger bigInteger = new BigInteger(numberTwo); // създаваме нов обект BigInteger като тук вкарваме
        // стойността директно от текста число numberTwo

        BigInteger sum = bigInteger.add(BigInteger.valueOf(numberOne)); // тук с BigInteger.valueOf(int)  правим то на
                                    // текст понеже само с текст работи

        System.out.println(sum);

    }
}
