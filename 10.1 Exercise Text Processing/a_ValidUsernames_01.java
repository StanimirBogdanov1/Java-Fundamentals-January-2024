package J_J_ExerciseTextProcessing_9_1;

import java.util.Scanner;

public class a_ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String inputNape=scanner.nextLine();

        String[] inputNameArr=inputNape.split(", ");


        for(String name:inputNameArr){
            int nameLength=name.length();

            if(nameLength>=3 && nameLength<=16){
                char[] symbolsName=name.toCharArray();

                boolean isRealName=true;
                for(char symbol:symbolsName){
                    if(!(Character.isLetter(symbol)||Character.isDigit(symbol)||
                    symbol=='-'|| symbol=='_')){
                        isRealName=false;
                        break;
                    }
                }
                if(isRealName){
                    System.out.println(name);
                }
            }


        }


    }
}
