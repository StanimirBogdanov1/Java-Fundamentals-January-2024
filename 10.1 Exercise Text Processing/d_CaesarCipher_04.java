package J_J_ExerciseTextProcessing_9_1;

import java.util.Scanner;

public class d_CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String input=scanner.nextLine();

        StringBuilder encryptedBuilder=new StringBuilder();

        for(int index=0;index<input.length();index++){
            char symbol = (char)(input.charAt(index)+3);


            encryptedBuilder.append(symbol);

        }


        System.out.println(encryptedBuilder.toString());
    }
}
