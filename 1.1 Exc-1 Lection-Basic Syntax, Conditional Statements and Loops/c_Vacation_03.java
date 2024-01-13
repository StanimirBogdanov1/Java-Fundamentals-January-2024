package AA_BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class c_Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberPeople =Integer.parseInt(scanner.nextLine());
        String typeOfGroup=scanner.nextLine();
        String day =scanner.nextLine();

        double price=0.00;

        switch (typeOfGroup){
            case "Students":
                if(day.equals("Friday")){
                    price=8.45;
                }else if(day.equals("Saturday")){
                    price=9.80;
                }else if(day.equals("Sunday")){
                    price=10.46;
                }
                if(numberPeople>=30){
                    price=price*0.85;
                }

                break;
            case "Business":
                if(day.equals("Friday")){
                    price=10.90;
                }else if(day.equals("Saturday")){
                    price=15.60;
                }else if(day.equals("Sunday")){
                    price=16.0;
                }
                if(numberPeople>=100){
                    numberPeople=numberPeople-10;
                }
                break;
            case "Regular":
                if(day.equals("Friday")){
                    price=15.0;
                }else if(day.equals("Saturday")){
                    price=20.0;
                }else if(day.equals("Sunday")){
                    price=22.50;
                }
                if(numberPeople>=10 &&numberPeople<=20){
                    price=price*0.95;
                }
                break;
        }
        double totalPrice=numberPeople*price;

        System.out.printf("Total price: %.2f",totalPrice);



    }
}
