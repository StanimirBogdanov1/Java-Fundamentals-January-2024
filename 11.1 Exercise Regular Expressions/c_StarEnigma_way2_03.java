package K_K_RegularExpressionsExercises_10_1;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c_StarEnigma_way2_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String regex="[starSTAR]";
        String regexForLists ="@(?<planetName>[A-Z][a-z]+)[^@\\-!:>]*:(?<people>[0-9])[^@\\-!:>]*!(?<typeAtack>[AD])![^@\\-!:>]*->(?<soldiers>[0-9]+)";
        Pattern pattern=Pattern.compile(regex);

        int input=Integer.parseInt(scanner.nextLine());


        List<String> attackList =new ArrayList<>();
        List<String> destroyedList =new ArrayList<>();

        for(int countInputs=1;countInputs<=input;countInputs++){
            String inputText=scanner.nextLine();
            Matcher matcher = pattern.matcher(inputText);
            int count=0;
            while(matcher.find()){
                count++;
            }

            StringBuilder newTextBuilder = new StringBuilder();

            for(char symbol:inputText.toCharArray()){
                char newSymbol=(char)(symbol-count);
                newTextBuilder.append(newSymbol);
            }

            Pattern patternForList = Pattern.compile(regexForLists);
            Matcher matcherForList = patternForList.matcher(newTextBuilder.toString());

            while(matcherForList.find()){
                String planetName=matcherForList.group("planetName");
                String attackType=matcherForList.group("typeAtack");

                switch (attackType){
                    case "A":
                        attackList.add(planetName);
                        break;
                    case "D":
                        destroyedList.add(planetName);
                        break;
                }
            }

        }

        System.out.printf("Attacked planets: %d%n",attackList.size());
        attackList.stream().sorted().forEach(atackPlanet -> System.out.println(String.format("-> %s",atackPlanet)));


        System.out.printf("Destroyed planets: %d%n",destroyedList.size());
        destroyedList.stream().sorted().forEach(destroyPlanet -> System.out.println(String.format("-> %s",destroyPlanet)));



    }
}
