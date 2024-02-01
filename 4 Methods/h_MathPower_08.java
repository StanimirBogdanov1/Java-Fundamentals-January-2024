package D_Methods_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class h_MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double powerOfNumber=Double.parseDouble(scanner.nextLine());
        int number=Integer.parseInt(scanner.nextLine());

        double result=(numberRaisedToPower(powerOfNumber,number));


        // this is the true solution with this template
        System.out.println(new DecimalFormat("0.####").format(result));


    }

    public static Double numberRaisedToPower(double powerOfNumber,int number){

        double result=Math.pow(powerOfNumber,number);

        return result;
    }

}
