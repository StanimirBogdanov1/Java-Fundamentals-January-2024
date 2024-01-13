package AA_BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class e_Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usarname =scanner.nextLine();
        String password = scanner.nextLine();

        int usarnameLength=usarname.length();
        String reversedUsarname="";

        for(int i=0;i<usarnameLength;i++){
            char symbol=usarname.charAt(i);
            reversedUsarname=symbol+reversedUsarname;
        }
        int numberOfAttempts =0;

        while (!password.equals(reversedUsarname)){
            numberOfAttempts++;

            if(numberOfAttempts==4){
                System.out.printf("User %s blocked!",usarname);
                return;
            }

            System.out.println("Incorrect password. Try again.");

            password = scanner.nextLine();
        }


        System.out.printf("User %s logged in.",usarname);
    }
}
