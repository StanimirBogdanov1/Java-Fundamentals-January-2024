package J_J_ExerciseTextProcessing_9_1;

import java.util.Scanner;

public class b_CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] inputArr=scanner.nextLine().split(" ");
        String firstWord=inputArr[0];
        String secondWord=inputArr[1];

        int result=characterMultiplier(firstWord,secondWord);

        System.out.println(result);

    }


    public static int characterMultiplier(String firstWord, String secondWord) {

        char[] firstWordSymbolsArr = firstWord.toCharArray();
        char[] secondWordSymbolsArr = secondWord.toCharArray();

        int charLength = 0;

        if (firstWordSymbolsArr.length <= secondWordSymbolsArr.length) {
            charLength = firstWordSymbolsArr.length;
        } else {
            charLength = secondWordSymbolsArr.length;
        }

        int sum = 0;
        for (int index = 0; index < charLength; index++) {
            int firstSymbolAski = firstWordSymbolsArr[index];
            int secondSymbolAski = secondWordSymbolsArr[index];

            sum = sum + (firstSymbolAski * secondSymbolAski);

        }
        if (firstWordSymbolsArr.length > charLength) {
            for (int indexNext = charLength; indexNext < firstWordSymbolsArr.length; indexNext++) {
                int firstSymbolAski = firstWordSymbolsArr[indexNext];
                sum += firstSymbolAski;
            }
        } else {
            for (int indexNext = charLength; indexNext < secondWordSymbolsArr.length; indexNext++) {
                int secondSymbolAski = secondWordSymbolsArr[indexNext];
                sum += secondSymbolAski;
            }
        }
            return sum;


        }



}
