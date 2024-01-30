package CC_ArraysExercise_3_1;

import java.util.Arrays;
import java.util.Scanner;

public class e_TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

//        String[] textArr = scanner.nextLine().split(" ");
//
//        int[] numArr= Arrays.stream(textArr).mapToInt(Integer::parseInt).toArray();
//
//
//
//
//
//        String resultPosition="";
//        for(int position=0;position<numArr.length;position++){
//
//            boolean isTop =true;
//            for(int currentPosition=position+1;currentPosition<numArr.length;currentPosition++){
//
//                if(numArr[position]<=numArr[currentPosition]){
//                    isTop=false;
//                    break;
//                }
//            }
//
//            if(isTop){
//                System.out.print(numArr[position]+" ");
//            }
//
//
//        }




        int[] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        for(int index=0;index<numbers.length;index++){
            int currentNum=numbers[index];

            boolean isBigger=true;
            for(int index2=index+1;index2<numbers.length;index2++){
                int afterCurrentNum=numbers[index2];

                if(currentNum<=afterCurrentNum){
                    isBigger=false;
                    break;
                }

            }
            if(isBigger){
                System.out.print(numbers[index]+" ");
            }

        }





    }
}
