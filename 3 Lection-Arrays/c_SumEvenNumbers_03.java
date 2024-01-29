package C_ArraysLab_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class c_SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String input=scanner.nextLine();
//        String[] inputArr=input.split(" ");
//        int[] numbersArr= Arrays.stream(inputArr).mapToInt(Integer::parseInt).toArray();

        int [] numbersArr =Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int sum=0;

//        for(int number=0;number<numbersArr.length;number++){
//            if(numbersArr[number]%2==0){
//                sum+=numbersArr[number];
//            }
//        }


        for(int number : numbersArr){

            if(number%2==0){
                sum+=number;
            }
        }

        System.out.println(sum);





    }
}
