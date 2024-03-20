package K_K_RegularExpressionsExercises_10_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a_Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input=scanner.nextLine();
        String regex=">>(?<furniture>[A-Z]+[a-z]*)<<(?<price>[0-9]+[\\.0-9]*)!(?<quantity>[0-9]+)\\b";

        double totalPrice=0.00;

        System.out.println("Bought furniture:");
        while(!input.equals("Purchase")){

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                System.out.println(matcher.group("furniture"));
                totalPrice+=(Double.parseDouble(matcher.group("price"))*Double.parseDouble(matcher.group("quantity")));
            }

//            while(matcher.find()){
//                System.out.println(matcher.group("furniture"));
//                totalPrice+=(Double.parseDouble(matcher.group("price"))*Double.parseDouble(matcher.group("quantity")));
//            }





            input=scanner.nextLine();
        }

        System.out.printf("Total money spend: %.2f",totalPrice);



    }
}
