package CC_ArraysExercise_3_1;

import java.util.Arrays;
import java.util.Scanner;

public class g_CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int[] numberArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        while(!(numberArr.length==1)) {

            int[] productArr = new int[numberArr.length - 1];


            for (int position = 0; position < numberArr.length - 1; position++) {

                productArr[position] = numberArr[position] + numberArr[position + 1];


            }
            numberArr=productArr;



        }


        System.out.println(numberArr[0]);


    }
}
