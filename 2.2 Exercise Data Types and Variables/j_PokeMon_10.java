package BB_DataTypesAndVariablesExercise_2_1;

import java.util.Scanner;

public class j_PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int pokePower=Integer.parseInt(scanner.nextLine());
        int distance=Integer.parseInt(scanner.nextLine());
        int factor=Integer.parseInt(scanner.nextLine());

        double startPower=(pokePower*1.0/100)*50;

        int count=0;
        while(pokePower>=distance){

            pokePower=pokePower-distance;
            count++;

            if(startPower==pokePower){
                if(factor!=0){
                    pokePower=pokePower/factor;
                }
            }

        }


        System.out.println(pokePower);
        System.out.println(count);



    }
}
