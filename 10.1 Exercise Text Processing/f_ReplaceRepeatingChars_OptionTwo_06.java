package J_J_ExerciseTextProcessing_9_1;

import java.util.Scanner;

public class f_ReplaceRepeatingChars_OptionTwo_06 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        char index = str.charAt(0);
        sb.append(index);

        for (char symbol :str.toCharArray()) {

            char current = symbol;

            if (current != index) {

                sb.append(current);
                index = current;

            }
        }

        System.out.println(sb);
    }

}
