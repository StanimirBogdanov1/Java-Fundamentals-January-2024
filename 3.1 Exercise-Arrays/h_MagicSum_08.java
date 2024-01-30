package CC_ArraysExercise_3_1;

import java.util.Arrays;
import java.util.Scanner;

public class h_MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int numberInput=Integer.parseInt(scanner.nextLine());


        for(int index=0;index<inputArr.length;index++){
            int currentNum=inputArr[index];

            int numberAfter=0;
            for(int i=index+1;i<inputArr.length;i++){
                numberAfter =inputArr[i];

                if(currentNum+numberAfter==numberInput){
                    System.out.println(currentNum+" "+numberAfter);
                }


            }


        }






    }
}
