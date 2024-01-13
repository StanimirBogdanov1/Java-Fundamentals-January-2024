package AA_BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class g_VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String input=scanner.nextLine();


        double sumMoney=0.00;
        while(!input.equals("Start")){
            double money =Double.parseDouble(input);

            if(money==0.1){             //мОЖЕ НА 1 РЕД С ||
                sumMoney+=money;
            }else if(money==0.2){
                sumMoney+=money;
            }else if(money==0.5){
                sumMoney+=money;
            }else if(money==1.0){
                sumMoney+=money;
            }else if(money==2.0){
                sumMoney+=money;
            }else{
                System.out.printf("Cannot accept %.2f\n",money);
            }


            input=scanner.nextLine();
        }

        String product=scanner.nextLine();

        while(!product.equals("End")){


            switch (product){
                case "Nuts":
                    double nutsPrice=2.0;
                    if(sumMoney>=nutsPrice) {
                        sumMoney = sumMoney - nutsPrice;
                        System.out.printf("Purchased %s\n",product);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    double waterPrice=0.7;
                    if(sumMoney>=waterPrice) {
                        sumMoney = sumMoney - waterPrice;
                        System.out.printf("Purchased %s\n",product);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    double crispsPrice=1.5;
                    if(sumMoney>=crispsPrice) {
                        sumMoney = sumMoney - crispsPrice;
                        System.out.printf("Purchased %s\n",product);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    double sodaPrice=0.8;
                    if(sumMoney>=sodaPrice) {
                        sumMoney = sumMoney - sodaPrice;
                        System.out.printf("Purchased %s\n",product);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    double cokePrice=1.0;
                    if(sumMoney>=cokePrice) {
                        sumMoney = sumMoney - cokePrice;
                        System.out.printf("Purchased %s\n",product);
                    }else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            product=scanner.nextLine();
        }

        System.out.printf("Change: %.2f\n",sumMoney);

    }
}
