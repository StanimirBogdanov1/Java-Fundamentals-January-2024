package BBB_DataTypesandVariablesMoreExercise_2_2;

import java.util.List;
import java.util.Scanner;

public class b_FromLefttoTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int input=Integer.parseInt(scanner.nextLine());



        for(int i=0;i<input;i++){
            String num1=scanner.next();
            String num2 =scanner.next();

            long number1=(Long.parseLong(num1));
            long number2=(Long.parseLong(num2));
            long sum=0;
            if(number1>=number2){
                while(number1!=0){
                    long remainder=number1%10;
                    sum+=remainder;
                    number1=number1/10;

//                String numberAdString=number1+"";
//                for(int s=0;s<numberAdString.length();s++){
//                    long symbol=Long.parseLong(numberAdString.charAt(s)+"");
//                    sum+=symbol;
                }
                System.out.println(Math.abs(sum));

            }else {

                while(number2!=0){
                    long remainder=number2%10;
                    sum+=remainder;
                    number2=number2/10;
//                String numberAdString=number2+"";
//                for(int s=0;s<numberAdString.length();s++){
//                    long symbol=Long.parseLong(numberAdString.charAt(s)+"");
//                    sum+=symbol;
                }
                System.out.println(Math.abs(sum));
            }

        }




    }
}
