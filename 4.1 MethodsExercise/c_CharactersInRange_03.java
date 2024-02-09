package DD_MethodsExercise_4_1;

import java.util.Scanner;

public class c_CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        char symbolOne=scanner.nextLine().charAt(0);
        char symbolTwo=scanner.nextLine().charAt(0);



        printCharactersBetweenTwoCharacters(symbolOne,symbolTwo);


    }


    public static void printCharactersBetweenTwoCharacters(char symbolOne,char symbolTwo){


        if(symbolOne>symbolTwo){
            char symbolChande=0;
            symbolChande=symbolOne;
            symbolOne=symbolTwo;
            symbolTwo=symbolChande;
        }

        for(int startPrint=symbolOne+1;startPrint<symbolTwo;startPrint++){

            System.out.print((char)startPrint+" ");
        }


    }

}
