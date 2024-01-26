package BB_DataTypesAndVariablesExercise_2_1;

import java.util.Scanner;

public class i_SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int startingYieldSource =Integer.parseInt(scanner.nextLine());


        int total=0;
        int countDays=0;

        while (startingYieldSource>=100){

            countDays++;
            total=total+startingYieldSource-26;



            startingYieldSource=startingYieldSource-10;
            if(startingYieldSource<100){
                total-=26;
            }


        }

        System.out.println(countDays);
        System.out.println(total);




    }
}
