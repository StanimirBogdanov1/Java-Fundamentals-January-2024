package CC_ArraysExercise_3_1;

import java.util.Scanner;

public class b_CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] input1Arr=scanner.nextLine().split(" ");
        String[] input2Arr=scanner.nextLine().split(" ");


        int input1ArrLength=input1Arr.length;
        int input2ArrLength=input2Arr.length;


        String commonWords="";
        for(int positionArr2=0;positionArr2<input2ArrLength;positionArr2++){

            for(int positionArr1=0;positionArr1<input1ArrLength;positionArr1++){

                if(input2Arr[positionArr2].equals(input1Arr[positionArr1])){
                    commonWords+=input2Arr[positionArr2]+" ";
                }

            }

        }

        // print 1 way
        // System.out.println(commonWords);



        String[] commonArr=commonWords.split(" ");

//        print 2 way
//        for(int position=0;position<=commonArr.length-1;position++){
//
//            System.out.print(commonArr[position]+" ");
//        }

        // print 3 way
//        for(String words:commonArr){
//
//            System.out.print(words+" ");
//        }


        // print 4 way
        System.out.println(String.join(" ",commonArr));


    }
}
