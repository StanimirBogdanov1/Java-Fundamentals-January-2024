package AA_BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class a_Ages_01 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);


        int ages = Integer.parseInt(scanner.nextLine());

        String people ="";

        if(ages>=0 && ages <=2){
            people="baby";
        }else if(ages>=3&&ages<=13){
            people="child";
        }else if(ages>=14 && ages<=19){
            people="teenager";
        }else if(ages>=20 && ages<=65){
            people="adult";
        }else{
            people="elder";
        }

        System.out.println(people);


    }
}
