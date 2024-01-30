package CC_ArraysExercise_3_1;

import java.util.Arrays;
import java.util.Scanner;

public class f_EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int[] numbersArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for(int position=0;position<numbersArr.length;position++){
            int currentNum=position;


            int leftArrSum=0;
            for(int leftArrPosition=0;leftArrPosition<position;leftArrPosition++){
                int currentLeftNum=numbersArr[leftArrPosition];
                leftArrSum+=currentLeftNum;
            }

            int rightArrSum=0;
            for(int rightArrPosition=position+1;rightArrPosition<numbersArr.length;rightArrPosition++){
                int currentRightNum=numbersArr[rightArrPosition];
                rightArrSum+=currentRightNum;
            }

            if(leftArrSum==rightArrSum){
                System.out.println(currentNum);
                return;
            }



        }

        System.out.println("no");




    }
}
