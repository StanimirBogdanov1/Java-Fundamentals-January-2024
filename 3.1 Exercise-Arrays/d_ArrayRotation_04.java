package CC_ArraysExercise_3_1;

import java.util.Arrays;
import java.util.Scanner;

public class d_ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

//        int[] numArr= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//        int numRotations=Integer.parseInt(scanner.nextLine());
//
//        int[] rotatedArr=new int[numArr.length];
//
//        for(int i=0;i<numRotations;i++){
//
//            int finalNum=rotatedArr[rotatedArr.length-1];
//            int startNum=rotatedArr[0];
//            for(int position=0;position<numArr.length;position++){
//
//                rotatedArr[position]=numArr[position];
//                rotatedArr[0]=finalNum;
//                rotatedArr[rotatedArr.length-1]=startNum;
//
//            }
//            System.out.println(finalNum);
//            System.out.println(startNum);
//        }

//        for(int rotated:rotatedArr){
//            System.out.print(rotated+" ");
//        }


        String[] inputArr=scanner.nextLine().split(" ");
        int roll = Integer.parseInt(scanner.nextLine());



        for(int i=0;i<roll;i++){
            String firstElement= inputArr[0];
            for(int position=0;position<inputArr.length-1;position++){


                inputArr[position]=inputArr[position+1];

            }
            inputArr[inputArr.length-1]=firstElement;


        }

        for(String rollingArr:inputArr){
            System.out.print(rollingArr+" ");
        }



    }
}
