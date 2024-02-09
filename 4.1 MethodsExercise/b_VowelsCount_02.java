package DD_MethodsExercise_4_1;


import java.util.Scanner;

public class b_VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText=scanner.nextLine();

        char[] textToCharArr=inputText.toCharArray();

        int countOfVowels=vowelsCount(textToCharArr);

        System.out.println(countOfVowels);

    }

    //Here we are testing the return method

    public static int vowelsCount(char[] textToCharArr){

        int count=0;
        for(int symbolIndex=0;symbolIndex<textToCharArr.length;symbolIndex++){
            char symbol=textToCharArr[symbolIndex];

            if(symbol=='a'||symbol=='u'||symbol=='o'||symbol=='y'||symbol=='e'||symbol=='i'||
                    symbol=='A'||symbol=='U'||symbol=='O'||symbol=='Y'||symbol=='E'||symbol=='I'){
                count++;
            }


        }
        return count;

    }




}
