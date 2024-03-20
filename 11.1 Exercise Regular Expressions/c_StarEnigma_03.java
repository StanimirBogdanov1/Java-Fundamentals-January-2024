package K_K_RegularExpressionsExercises_10_1;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c_StarEnigma_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String regex="[starSTAR]";
        Pattern pattern=Pattern.compile(regex);




        int input=Integer.parseInt(scanner.nextLine());


        List<String> newTextList=new ArrayList<>();
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
            newTextList.add(newTextBuilder.toString());



        }



         regex = "@(?<name>[A-Z][a-z]+)[^@\\-!:>]*:(?<people>[0-9])[^@\\-!:>]*!(?<typeAtack>[AD])![^@\\-!:>]*->(?<soldiers>[0-9]+)";

         pattern =Pattern.compile(regex);

        int atack=0;
        int destroy=0;

        for(String indexList:newTextList){
           Matcher  matcher = pattern.matcher(indexList);

            while (matcher.find()){
                if(matcher.group("typeAtack").equals("A")){
                    atack++;
                }else if(matcher.group("typeAtack").equals("D")){
                    destroy++;
                }
            }
        }

        Collections.sort(newTextList);

        System.out.printf("Attacked planets: %d\n",atack);
        for(String element:newTextList) {
            Matcher matcher = pattern.matcher(element);



            while(matcher.find()){
                String name=matcher.group("name");

                if(matcher.group("typeAtack").equals("A")) {


                    System.out.printf("-> %s\n", name);
                }

            }

        }
        System.out.printf("Destroyed planets: %d\n",destroy);
        for(String element:newTextList) {
            Matcher matcher = pattern.matcher(element);



            while(matcher.find()){
                String name=matcher.group("name");

                if(matcher.group("typeAtack").equals("D")) {


                    System.out.printf("-> %s\n", name);
                }

            }

        }




        System.out.println();

    }
}
