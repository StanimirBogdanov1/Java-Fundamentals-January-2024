package BB_DataTypesAndVariablesExercise_2_1;

import java.util.Scanner;

public class h_BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int input=Integer.parseInt(scanner.nextLine());


        String biggetsKeg="";
        double maxValue=Double.MIN_VALUE;

        for(int i=1;i<=input;i++){
            String typeKeg=scanner.nextLine();
            double radiusKeg=Double.parseDouble(scanner.nextLine());
            int heighKeg=Integer.parseInt(scanner.nextLine());

            double volumeKeg=Math.PI*Math.pow(radiusKeg,2)*heighKeg;


            if(volumeKeg>maxValue){
                biggetsKeg=typeKeg;
                maxValue=volumeKeg;
            }

        }

        System.out.println(biggetsKeg);



    }
}
