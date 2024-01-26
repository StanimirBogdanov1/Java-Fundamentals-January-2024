package BB_DataTypesAndVariablesExercise_2_1;

import java.util.Scanner;

public class b_SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

//        int inputNumber=Integer.parseInt(scanner.nextLine());
//
//
//        int sum=0;
//        while(inputNumber>0){
//
//            int remainder= inputNumber%10;
//            sum=sum+remainder;
//            inputNumber=inputNumber/10;
//
//        }
//
//        System.out.println(sum);


        String inputNumber=scanner.nextLine();

        int sum=0;
        for(int i=0;i<inputNumber.length();i++){
            int digit= Integer.parseInt(inputNumber.charAt(i)+"");

            sum+=digit;

        }

        System.out.println(sum);


    }
}
