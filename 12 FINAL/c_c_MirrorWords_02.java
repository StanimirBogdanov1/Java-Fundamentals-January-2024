package L_FINAL_EXAM_oldsExe_11;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c_c_MirrorWords_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input=scanner.nextLine();

        String regex="(?<symbol>[@#])(?<word>[A-Za-z]{3,})(\\1)(\\1)(?<word2>[A-Za-z]{3,})(\\1)";

        Pattern pattern =Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);





        List<String> matchWordsList = new ArrayList<>();
        int count=0;
        while (matcher.find()){
            count++;

            String firstPart = matcher.group("word");
            String secondPart = matcher.group("word2");
            StringBuilder reverseBuilder = new StringBuilder(secondPart);
            reverseBuilder.reverse();
            String reversedWords=reverseBuilder.toString();
            if(firstPart.equals(reversedWords)){

                matchWordsList.add(String.format("%s <=> %s",firstPart,secondPart));
            }

        }

        System.out.println();

        if(count==0){
            System.out.println("No word pairs found!");

            if(matchWordsList.size()==0){
                System.out.println("No mirror words!\n");
            }
        }else{
            System.out.printf("%d word pairs found!\n",count);

            if(matchWordsList.size()==0){
                System.out.println("No mirror words!\n");
            }else{
                System.out.println("The mirror words are:");
                System.out.print(String.join(", ",matchWordsList));
            }

        }





    }
}
