package AA_BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class k_RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames=Integer.parseInt(scanner.nextLine());
        double headSetPrice=Double.parseDouble(scanner.nextLine());
        double mousePrice=Double.parseDouble(scanner.nextLine());
        double keyBoardPrice=Double.parseDouble(scanner.nextLine());
        double displayPrice=Double.parseDouble(scanner.nextLine());


        int headSetCount=0;
        int mouseCount=0;
        int keyBoardCount=0;
        int displayCount=0;



        for(int losingPosition=1;losingPosition<=lostGames;losingPosition++){


            if(losingPosition%2==0){
                headSetCount++;

            }
            if(losingPosition%3==0){
                mouseCount++;

            }
            if(losingPosition%6==0){
                keyBoardCount++;
            }

            if(losingPosition%12==0){
                displayCount++;
            }

        }

        double expense =(headSetCount*headSetPrice)+(mouseCount*mousePrice)+(keyBoardCount*keyBoardPrice)+(displayCount*displayPrice);

        System.out.printf("Rage expenses: %.2f lv.",expense);


    }
}
