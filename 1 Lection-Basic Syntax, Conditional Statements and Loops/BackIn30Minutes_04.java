package LectionBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours =Integer.parseInt(scanner.nextLine());
        int minutes =Integer.parseInt(scanner.nextLine());

        int hoursInMinutes = hours*60;
        int totalMinutes =hoursInMinutes+minutes+30;

        int minutesInHours= totalMinutes/60;
        int finalMinutes = totalMinutes-(minutesInHours*60);

        if(minutesInHours<=23){
            if(finalMinutes<=9){
                System.out.printf("%d:0%d", minutesInHours, finalMinutes);
            }else {
                System.out.printf("%d:%d", minutesInHours, finalMinutes);
            }
        }else{
            minutesInHours=0;
            System.out.printf("%d:%d",minutesInHours,finalMinutes);
        }


    }
}
