package DD_MethodsExercise_4_1;

import java.util.Scanner;

public class d_PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputPassword=scanner.nextLine();
        char[] stringToCharArr=inputPassword.toCharArray();


        boolean thereAreEnoughSymbols = thereAreEnoughSymbols(stringToCharArr);
        boolean isThereOnlyLettersAndDigits = isThereOnlyLettersAndDigits(stringToCharArr);
        boolean leastTwoDigits = leastTwoDigits(stringToCharArr);

        if(thereAreEnoughSymbols && isThereOnlyLettersAndDigits && leastTwoDigits){
            System.out.println("Password is valid");
        }

    }



    public static boolean thereAreEnoughSymbols(char[] stringToCharArr){


       int countSymbold= stringToCharArr.length;

       boolean enoughSymbols=true;
       if(countSymbold<6 || countSymbold>10){
           enoughSymbols=false;
           System.out.println("Password must be between 6 and 10 characters");
       }
       return enoughSymbols;

    }

    public static boolean isThereOnlyLettersAndDigits(char[] stringToCharArr){


        boolean isLetterDiggitorNot=false;
        for(int index=0;index<stringToCharArr.length;index++){
            char symbol=stringToCharArr[index];
            if(symbol>='0' && symbol<='9'){
                isLetterDiggitorNot=true;
            }else if(symbol>='a' && symbol<='z'){
                isLetterDiggitorNot=true;
            }else if(symbol>='A' && symbol<='Z'){
                isLetterDiggitorNot=true;
            }else{
                isLetterDiggitorNot=false;
                    System.out.println("Password must consist only of letters and digits");
                    return isLetterDiggitorNot;

            }



        }

        return isLetterDiggitorNot;

    }


    public static boolean leastTwoDigits(char[] stringToCharArr){

        boolean moreThatOneDigits=false;
        int countDigits=0;
        for(int index=0;index<stringToCharArr.length;index++){
            char symbol=stringToCharArr[index];

            if(symbol>='0'&&symbol<='9'){
                countDigits++;
            }
            if(countDigits>=2){
                moreThatOneDigits=true;
                return moreThatOneDigits;
            }

        }

        System.out.println("Password must have at least 2 digits");

        return moreThatOneDigits;





    }


}
