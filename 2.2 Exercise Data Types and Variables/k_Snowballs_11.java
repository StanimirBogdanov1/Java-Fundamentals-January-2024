package BB_DataTypesAndVariablesExercise_2_1;

import java.util.Scanner;

public class k_Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int input=Integer.parseInt(scanner.nextLine());

        double bestSnowball= Double.MIN_VALUE;
        int snowballBiggets=0;
        int snowballTimeBiggest=0;
        int snowBallQual=0;

        for(int i=0;i<input;i++){
            int snowballSnow =Integer.parseInt(scanner.nextLine());
            int snowballTime  =Integer.parseInt(scanner.nextLine());
            int snowballQuality  =Integer.parseInt(scanner.nextLine());



            double snowballValue = Math.pow((snowballSnow*1.0/snowballTime),snowballQuality);

            if(snowballValue>bestSnowball){

                bestSnowball=snowballValue;
                snowballBiggets=snowballSnow;
                snowballTimeBiggest=snowballTime;
                snowBallQual=snowballQuality;
            }


        }

        System.out.printf("%d : %d = %.0f (%d)",snowballBiggets,snowballTimeBiggest,bestSnowball,snowBallQual);



    }
}
