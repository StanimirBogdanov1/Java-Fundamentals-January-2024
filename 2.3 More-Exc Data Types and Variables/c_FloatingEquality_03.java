package BBB_DataTypesandVariablesMoreExercise_2_2;

import java.util.Scanner;

public class c_FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


//        double a = Double.parseDouble(scanner.nextLine());
//        double b = Double.parseDouble(scanner.nextLine());
//
//        boolean ch = Math.abs(a - b) < 0.000001;
//
//        System.out.println(ch);





        double number1=Double.parseDouble(scanner.nextLine());
        double number2=Double.parseDouble(scanner.nextLine());

        double esp=0.000001;

        double subtract= Math.abs(number1-number2);

        if(subtract<esp){
            System.out.println("True");
        }else{
            System.out.println("False");
        }




    }
}
