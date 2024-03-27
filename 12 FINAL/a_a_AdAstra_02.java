package L_FINAL_EXAM_oldsExe_11;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a_a_AdAstra_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String inputText=scanner.nextLine();
        String regexInput="([#|])(?<name>[A-Za-z\\s]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d{1,5})\\1";
        Pattern inputTextPattern=Pattern.compile(regexInput);
        Matcher inputTextMatcher =inputTextPattern.matcher(inputText);




        List<String> resultList = new ArrayList<>();
        int totalCalories=0;
        while(inputTextMatcher.find()){
            String name=inputTextMatcher.group("name");
            String date =inputTextMatcher.group("date");
            int calories=Integer.parseInt(inputTextMatcher.group("calories"));
            totalCalories+=calories;

            resultList.add(String.format("Item: %s, Best before: %s, Nutrition: %d",name,date,calories));

        }



        System.out.printf("You have food to last you for: %d days!\n",totalCalories/2000);
        for(String result:resultList){
            System.out.println(result);
        }



    }
}
