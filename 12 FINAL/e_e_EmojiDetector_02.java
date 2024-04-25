package L_FINAL_EXAM_oldsExe_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class e_e_EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String inputText=scanner.nextLine();

        String regexNumbers="[0-9]";
        Pattern patternNumbers =Pattern.compile(regexNumbers);
        Matcher matcherNumbers=patternNumbers.matcher(inputText);

        int product=1;
        while(matcherNumbers.find()){
            product*=Integer.parseInt(matcherNumbers.group());
        }

        String regexEmojis="([:]{2})([A-Z][a-z]{2,})([:]{2})|([*]{2})([A-Z][a-z]{2,})([*]{2})";
        Pattern patternEmojis=Pattern.compile(regexEmojis);
        Matcher matcherEmojis=patternEmojis.matcher(inputText);

        List<String> emojisList = new ArrayList<>();
        int emojiesCount=0;
        while (matcherEmojis.find()){
            String emoji=matcherEmojis.group();
            emojiesCount++;

            int sumSymbols=0;
            for(char symbol:emoji.toCharArray()){
                if(Character.isLetter(symbol)){
                    sumSymbols+=symbol;
                }
            }
            if(sumSymbols>product) {

                emojisList.add(matcherEmojis.group());
            }
        }


        System.out.printf("Cool threshold: %d\n",product);

        System.out.printf("%d emojis found in the text. The cool ones are:\n",emojiesCount);

        emojisList.forEach(emojis -> System.out.println(emojis));




    }
}
