package J_J_ExerciseTextProcessing_9_1;

import java.util.Scanner;

public class f_ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input=scanner.nextLine();


        StringBuilder updateString=new StringBuilder();

        for(int index=0;index<input.length()-1;index++){        // . length-1;

            char symbol1=input.charAt(index);
            char symbol2=input.charAt(index+1);

            if(symbol1!=symbol2){
                updateString.append(symbol1);
            }

        }

        updateString.append(input.charAt(input.length()-1));
        System.out.println(updateString.toString());


    }
}
