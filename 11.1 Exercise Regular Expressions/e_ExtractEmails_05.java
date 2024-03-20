package K_K_RegularExpressionsExercises_10_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e_ExtractEmails_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String textInput = scanner.nextLine();
        String regexPart1= "[a-z]+[\\.\\-\\_]?[a-z]+";
        String regexPart2 = "@[a-z]{2,}[\\-\\.]?[a-z]+(([\\.][a-z]+)*)";
        String regex= regexPart1+regexPart2;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher= pattern.matcher(textInput);

       // List<String> emailList = new ArrayList<>();
        while(matcher.find()){

           // emailList.add(matcher.group());

            System.out.println(matcher.group());

        }

        // фор-еач на 1 ред
       // emailList.stream().forEach(System.out::println);



    }
}
