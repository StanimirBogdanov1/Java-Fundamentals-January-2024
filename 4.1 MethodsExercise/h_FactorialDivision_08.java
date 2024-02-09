package DD_MethodsExercise_4_1;

import java.util.Scanner;

public class h_FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numberOne=Integer.parseInt(scanner.nextLine());
        int numberTwo=Integer.parseInt(scanner.nextLine());

        long factorialOneNumber=findFactorial(numberOne);
        long factorialTwoNumber=findFactorial(numberTwo);

        double divideFirstbySecond=factorialOneNumber*1.0/factorialTwoNumber;

        System.out.printf("%.2f",divideFirstbySecond);



    }

    public static long findFactorial(int number){

        long product=1;
        for(int i=2;i<=number;i++){
            product*=i;
        }

        return product;
    }
}
