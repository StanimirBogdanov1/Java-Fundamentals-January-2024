package I_I_ExerciseAssociativeArrays_8_1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class d_SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int people=Integer.parseInt(scanner.nextLine());

        Map<String,String> parkingMap =new LinkedHashMap<>();

        for(int countPeople=1;countPeople<=people;countPeople++){
            String[] commandArr=scanner.nextLine().split(" ");
            String command=commandArr[0];

            switch (command){
                case "register":
                    String name=commandArr[1];
                    String licensePlateNumber=commandArr[2];

                    if(parkingMap.containsKey(name)){


                        System.out.printf("ERROR: already registered with plate number %s\n",licensePlateNumber);;
                    }else{
                        parkingMap.put(name,licensePlateNumber);

                        System.out.printf("%s registered %s successfully\n",name,licensePlateNumber);

                    }

                    break;
                case "unregister":
                    String nameUnreg=commandArr[1];
                    if(!parkingMap.containsKey(nameUnreg)){
                        System.out.printf("ERROR: user %s not found\n",nameUnreg);
                    }else{

                        parkingMap.remove(nameUnreg);
                        System.out.printf("%s unregistered successfully\n",nameUnreg);
                    }

                    break;
            }


        }

        for(Map.Entry<String,String> pair: parkingMap.entrySet()){

            System.out.printf("%s => %s\n",pair.getKey(),pair.getValue());
        }




    }
}
