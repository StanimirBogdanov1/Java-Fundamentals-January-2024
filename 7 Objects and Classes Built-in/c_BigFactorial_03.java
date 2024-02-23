package HHH_ObjectsandClasses_Built_in_7;

import java.math.BigInteger;
import java.util.Scanner;

public class c_BigFactorial_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int inputNumber=Integer.parseInt(scanner.nextLine());

        BigInteger numberBigInteger=new BigInteger("1");

        for(int count=1;count<=inputNumber;count++){

            numberBigInteger=numberBigInteger.multiply(BigInteger.valueOf(count));


        }

        System.out.println(numberBigInteger);



    }
}
