package AA_BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class j_PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double saberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());


        double sumSabers = Math.ceil(studentsCount * 1.10) * saberPrice;

        double sumRobes = studentsCount * robePrice;

        double sumBelts = (studentsCount - (studentsCount *1.0/ 6)) * beltPrice;


        double totalSum = sumSabers + sumRobes + sumBelts;

        if (totalSum <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalSum - budget));
        }




        //example 2
//        double amountOfMoney =Double.parseDouble(scanner.nextLine());
//        int countOfStudents =Integer.parseInt(scanner.nextLine());
//        double priceLightcabers =Double.parseDouble(scanner.nextLine());
//        double priceRobers =Double.parseDouble(scanner.nextLine());
//        double priceBelst =Double.parseDouble(scanner.nextLine());
//
//
//        double countOfLightCabers= Math.ceil(countOfStudents+(((countOfStudents*1.0)/100)*10));
//
//        int totalBelts=countOfStudents;
//        int count=0;
//        for(int i=0;i<countOfStudents;i++){
//            count++;
//            if(count==6){
//                totalBelts=totalBelts-1;
//                count=0;
//            }
//
//        }
//
//        double totalPrice = (priceLightcabers*countOfLightCabers)+(priceRobers*countOfStudents)+(priceBelst*totalBelts);
//
//       if(amountOfMoney>=totalPrice){
//           System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
//       }else{
//           totalPrice-=amountOfMoney;
//           System.out.printf("George Lucas will need %.2flv more.",totalPrice);
//       }



    }
}
