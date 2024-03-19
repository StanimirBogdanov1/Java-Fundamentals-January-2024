package K_RegularExpressions_10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c_MatchDates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String text=scanner.nextLine();
        String regex="\\b(?<day>[0-9]{2})([\\.\\-\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>[0-9]{4})\\b"; //регекс
       // String regex= "\\b(?<day>\\d{2})([\\.\\-\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b"; //регекс вариант 2
                      //   \\b(?<day>\\d{2})([\\.\\-\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b

        Pattern pattern = Pattern.compile(regex); //шаблон
        Matcher matcher = pattern.matcher(text); // // matcher -> пази съвкупност от текстове които отговарят на шаблона

        while(matcher.find()){
            //.find     true -> textInput отговаря на шаблона -> matcher.find() намира такъв текст за шаблона
            //.find     false -> textInput НЕ отговаря на шаблона

            String day=matcher.group("day"); // Така достъпваме групите от Regex
            String month=matcher.group("month"); // Така достъпваме групите от Regex
            String year=matcher.group("year");  // Така достъпваме групите от Regex

            System.out.printf("Day: %s, Month: %s, Year: %s\n",day,month,year);
        }


    }
}
