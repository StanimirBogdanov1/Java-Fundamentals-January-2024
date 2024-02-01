package D_Methods_4;

import java.util.Scanner;

public class d_Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String command=scanner.nextLine();
        int numberOne =Integer.parseInt(scanner.nextLine());
        int numberTwo =Integer.parseInt(scanner.nextLine());

        switch (command){
            case "add":
                sumNumbers(numberOne,numberTwo);
                break;
            case "multiply":
                multiplyNumbers(numberOne,numberTwo);
                break;
            case "subtract":
                subtractNumbers(numberOne,numberTwo);
                break;
            case "divide":
                divideNumbers(numberOne,numberTwo);
                break;

        }
    }

    public static void sumNumbers(int numberOne,int numberTwo){
        System.out.println(numberOne+numberTwo);
    }

    public static void multiplyNumbers(int numberOne,int numberTwo){
        System.out.println(numberOne*numberTwo);
    }

    public static void subtractNumbers(int numberOne,int numberTwo){
        System.out.println(numberOne-numberTwo);
    }

    public static void divideNumbers(int numberOne,int numberTwo){
        System.out.println(numberOne/numberTwo);
    }



}
