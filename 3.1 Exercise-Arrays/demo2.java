package CC_ArraysExercise_3_1;

import java.util.Arrays;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] number2= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        numbers=number2;

        for(int index=0;index<numbers.length;index++){
            numbers[index]=numbers[0];
        }


        System.out.println(Arrays.toString(numbers));

        System.out.println();









    }
}
