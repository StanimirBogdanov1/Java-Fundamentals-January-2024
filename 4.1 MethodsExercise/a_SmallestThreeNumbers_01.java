package DD_MethodsExercise_4_1;

import java.util.Scanner;

public class a_SmallestThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        // 1 way
        int numOne=Integer.parseInt(scanner.nextLine());
        int numTwo=Integer.parseInt(scanner.nextLine());
        int numThree=Integer.parseInt(scanner.nextLine());

        theSmallestNum(numOne,numTwo,numThree);


    }

    public static void theSmallestNum (int numOne,int numTwo,int numThree){

        int smallestNumber=Math.min(Math.min(numOne,numTwo),numThree);

        System.out.println(smallestNumber);
    }





}
