package BB_DataTypesAndVariablesExercise_2_1;

import java.util.Scanner;

public class g_WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int input=Integer.parseInt(scanner.nextLine());


        int totalLiters=0;
        for(int i=0;i<input;i++){

            int liters=Integer.parseInt(scanner.nextLine());


            totalLiters+=liters;
            if(totalLiters>255){
                System.out.println("Insufficient capacity!");
                totalLiters-=liters;
            }

        }
        System.out.println(totalLiters);


    }
}
