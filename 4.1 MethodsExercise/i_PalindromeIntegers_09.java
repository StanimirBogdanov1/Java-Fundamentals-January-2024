package DD_MethodsExercise_4_1;

import java.util.Scanner;

public class i_PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String command =scanner.nextLine();

        while(!(command.equals("END"))){


            boolean palindrome= isPalindrome(command);
            System.out.println(palindrome);

            command =scanner.nextLine();
        }


    }
    public static boolean isPalindrome(String numberAsText){



 // way 1  StringBuilder
//        StringBuilder builder=new StringBuilder(numberAsText);
//        String reverseText=builder.reverse().toString();


// way 2  basic way for
        String reverseText="";
        for(int index=numberAsText.length()-1;index>=0;index--){
            reverseText+=numberAsText.charAt(index);
        }



        return numberAsText.equals(reverseText);




    }
}
