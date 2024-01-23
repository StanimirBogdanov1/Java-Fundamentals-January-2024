package AAA_BasicSyntaxConditionalStatementsAndLoopsMoreExercise_1_3;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double currentBalance =Double.parseDouble(scanner.nextLine());

        double outfall4 =39.99;
        double csGO =15.99;
        double zplinterZell =19.99;
        double honered =59.99;
        double roverWatch =29.99;
        double roverWatchOrignEdition =39.99;

        double moneyLeftOver=currentBalance;
        double totalSpend=0.00;

        String games=scanner.nextLine();

        while(!games.equals("Game Time")){



            if(!games.equals("OutFall 4")&& !games.equals("CS: OG")&&!games.equals("Zplinter Zell")&&!games.equals("Honored 2")&&!games.equals("RoverWatch")&&!games.equals("RoverWatch Origins Edition")){
                System.out.println("Not Found");
            }

            switch (games){
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    if(moneyLeftOver>=outfall4){
                        moneyLeftOver=moneyLeftOver-outfall4;
                        totalSpend+=outfall4;
                        System.out.printf("Bought %s\n",games);

                    }else {
                        System.out.println("Too Expensive");
                    }



                    break;
                case "CS: OG":
                    if(moneyLeftOver>=csGO){
                        moneyLeftOver=moneyLeftOver-csGO;
                        totalSpend+=csGO;
                        System.out.printf("Bought %s\n",games);

                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":

                    if(moneyLeftOver>=zplinterZell){
                        moneyLeftOver=moneyLeftOver-zplinterZell;
                        totalSpend+=zplinterZell;
                        System.out.printf("Bought %s\n",games);

                    }else {
                        System.out.println("Too Expensive");
                    }




                    break;
                case "Honored 2":
                    if(moneyLeftOver>=honered){
                        moneyLeftOver=moneyLeftOver-honered;
                        totalSpend+=honered;
                        System.out.printf("Bought %s\n",games);

                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if(moneyLeftOver>=roverWatch){
                        moneyLeftOver=moneyLeftOver-roverWatch;
                        totalSpend+=roverWatch;
                        System.out.printf("Bought %s\n",games);

                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;


            }
             if(moneyLeftOver<=0){
                System.out.println("Out of money!");
                return;
            }





            games=scanner.nextLine();
        }

       // totalSpend=totalSpend-currentBalance;

        System.out.printf("Total spent: $%.2f. ",totalSpend);
        double remainder= currentBalance-totalSpend;
        System.out.printf("Remaining: $%.2f",remainder);




    }
}
