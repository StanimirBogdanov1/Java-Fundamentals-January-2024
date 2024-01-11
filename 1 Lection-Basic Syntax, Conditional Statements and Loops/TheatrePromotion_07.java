package LectionBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String typeDay =scanner.nextLine();
        int agePerson =Integer.parseInt(scanner.nextLine());

        int ticketPrice=0;
        boolean isInCathegory =true;

        switch (typeDay){
            case "Weekday":
                if(agePerson>=0 && agePerson<=18){
                    ticketPrice=12;
                }else if(agePerson>18 && agePerson<=64){
                    ticketPrice=18;
                }else if(agePerson>64 && agePerson<=122){
                    ticketPrice=12;
                }else{
                    isInCathegory=false;
                    System.out.println("Error!");
                }
                break;
            case "Weekend":
                if(agePerson>=0 && agePerson<=18){
                    ticketPrice=15;
                }else if(agePerson>18 && agePerson<=64){
                    ticketPrice=20;
                }else if(agePerson>64 && agePerson<=122){
                    ticketPrice=15;
                }else{
                    isInCathegory=false;
                    System.out.println("Error!");
                }
                break;
            case "Holiday":
                if(agePerson>=0 && agePerson<=18){
                    ticketPrice=5;
                }else if(agePerson>18 && agePerson<=64){
                    ticketPrice=12;
                }else if(agePerson>64 && agePerson<=122){
                    ticketPrice=10;
                }else{
                    isInCathegory=false;
                    System.out.println("Error!");
                }
                break;
        }
        if(isInCathegory){
            System.out.printf("%d$",ticketPrice);
        }

    }
}
