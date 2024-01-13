package AA_BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class i_Orders_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        int countOrders=Integer.parseInt(scanner.nextLine());


        double totalCoffeePrice=0.00;
        for(int i=0;i<countOrders;i++){

            double pricePerCapsule= Double.parseDouble(scanner.nextLine());
            int days=Integer.parseInt(scanner.nextLine());
            int capsule=Integer.parseInt(scanner.nextLine());

           double coffeePrice=pricePerCapsule*days*capsule;
            System.out.printf("The price for the coffee is: $%.2f\n",coffeePrice);
            totalCoffeePrice+=coffeePrice;

        }

        System.out.printf("Total: $%.2f",totalCoffeePrice);
    }
}
