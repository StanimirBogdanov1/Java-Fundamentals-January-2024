package BB_DataTypesAndVariablesExercise_2_1;

import java.util.Scanner;

public class c_Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        byte elevatePerson=Byte.parseByte(scanner.nextLine());
        byte capacityPerson=Byte.parseByte(scanner.nextLine());

        int fullCourcePerson=elevatePerson/capacityPerson;



        if(elevatePerson<=capacityPerson){
            System.out.println("1");
        }else if(fullCourcePerson%2==0) {

            System.out.println(fullCourcePerson);
        }else if(fullCourcePerson%2==1){
            System.out.println(fullCourcePerson+1);
        }



    }
}
