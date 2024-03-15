package J_J_ExerciseTextProcessing_9_1;

import java.util.Scanner;

public class g_StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input=scanner.nextLine();
        StringBuilder textBuilder=new StringBuilder(input);



        int totalStrength=0;
        for(int position=0;position<textBuilder.length();position++){
            char symbol=textBuilder.charAt(position);

            if(symbol=='>'){
                int explosionStrength=Integer.parseInt(textBuilder.charAt(position+1)+"");
                totalStrength+=explosionStrength;

            }else if(totalStrength>0){

                textBuilder.deleteCharAt(position);
                totalStrength--;
                position--;

            }

        }

        System.out.println(textBuilder);


    }
}

