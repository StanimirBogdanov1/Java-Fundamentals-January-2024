package C_ArraysLab_3;

import java.util.Arrays;
import java.util.Scanner;

public class e_EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int[] inputNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int sumEven=0;
        int sumOdd=0;

        for(int position =0;position<=inputNumbers.length-1;position++){

            if(inputNumbers[position]%2==0){
                sumEven+=inputNumbers[position];
            }else if(inputNumbers[position]%2==1){
                sumOdd+=inputNumbers[position];
            }


        }

        int result=sumEven-sumOdd;

        System.out.println(result);


    }
}
