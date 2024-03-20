package K_K_RegularExpressionsExercises_10_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d_NetherRealms_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] textArr=scanner.nextLine().split("\\s*,\\s*");
        for(String text:textArr) {
            String regex = "[0-9\\-.]+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            List<String> numList = new ArrayList<>();
            while (matcher.find()) {

                numList.add(matcher.group());
            }

            double total = 0.00;
            for (String elements : numList) {
                double num = Double.parseDouble(elements);

                if (elements.contains("-")) {
                    total = total + num;
                } else {
                    total += num;
                }

            }

            int totalHealth=0;
            for (int indexText = 0; indexText < text.length(); indexText++) {
                char symbol = text.charAt(indexText);
                if (symbol == '*') {
                    total *= 2;
                } else if (symbol == '/') {
                    total /= 2;
                }else if(!Character.isDigit(symbol)&&symbol!='+'&&symbol!='-'&&symbol!='.'){
                    totalHealth+=symbol;
                }
            }


            System.out.printf("%s - %d health, %.2f damage\n",text,totalHealth,total);

        }
        System.out.println();
    }
}
