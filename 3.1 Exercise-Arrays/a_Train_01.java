package CC_ArraysExercise_3_1;

import java.util.Scanner;

public class a_Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons=Integer.parseInt(scanner.nextLine());

        int[] wagonPeople=new int[wagons];

        for(int possition=0;possition<=wagonPeople.length-1;possition++){
            wagonPeople[possition]=Integer.parseInt(scanner.nextLine());

        }

        int sumOfPeople=0;
        for(int peopleInWagon :wagonPeople){

            System.out.print(peopleInWagon+" ");
            sumOfPeople+=peopleInWagon;
        }

        System.out.println();
        System.out.println(sumOfPeople);





    }
}
