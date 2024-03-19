package K_RegularExpressions_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b_MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String text=scanner.nextLine();
        String regex="\\+359([- ])2\\1[0-9]{3}\\1\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);


       // List<String> validNumbersList= new ArrayList<>();

        StringBuilder builderText=new StringBuilder();
        while(matcher.find()){

            builderText.append(matcher.group()+", ");

           // validNumbersList.add(matcher.group());
        }
        int last=builderText.lastIndexOf(",");
        builderText.deleteCharAt(last);

        System.out.print(builderText);
       // System.out.print(String.join(", ",validNumbersList));

    }
}
