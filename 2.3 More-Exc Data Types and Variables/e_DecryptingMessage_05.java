package BBB_DataTypesandVariablesMoreExercise_2_2;

import java.util.Scanner;

public class e_DecryptingMessage_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int key=Integer.parseInt(scanner.nextLine());
        int numberSymbols=Integer.parseInt(scanner.nextLine());



        String word="";

        for(int i=1;i<=numberSymbols;i++){
            char symbol=scanner.nextLine().charAt(0);
            int askiNumberSymbol=symbol;
            int updateSymbol=symbol+key;



            word=word+(char)(updateSymbol);

        }

        System.out.println(word);
    }
}
