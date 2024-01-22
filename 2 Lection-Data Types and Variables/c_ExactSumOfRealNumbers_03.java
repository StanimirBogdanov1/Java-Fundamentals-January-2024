package B_DataTypesAndVariables_2;

import java.math.BigDecimal;
import java.util.Scanner;

public class c_ExactSumOfRealNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        byte input =Byte.parseByte(scanner.nextLine());

        BigDecimal result=new BigDecimal(0);
        for(byte i=0;i<input;i++){
            BigDecimal number =new BigDecimal(scanner.nextLine());

            result=result.add(number);

        }

        System.out.println(result);


    }
}
