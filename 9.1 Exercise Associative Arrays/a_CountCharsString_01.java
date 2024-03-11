package I_I_ExerciseAssociativeArrays_8_1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class a_CountCharsString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String inputText=scanner.nextLine();


        char[] charInputTextArr=inputText.toCharArray();

        Map<Character,Integer> countSymbolsMap=new LinkedHashMap<>();

        for(int symbol=0;symbol<inputText.length();symbol++){
            char element=charInputTextArr[symbol];
            if(element==' '){
                continue;
            }

            if(!countSymbolsMap.containsKey(element)){
                countSymbolsMap.put(element,1);
            }else{
                int countElement=countSymbolsMap.get(element);
                countSymbolsMap.put(element,countElement+1);
            }


        }


        countSymbolsMap.entrySet().forEach(entry -> System.out.printf("%c -> %d\n",entry.getKey(),entry.getValue()));


    }
}
