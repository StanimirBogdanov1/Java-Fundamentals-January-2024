package F_MID_Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class f_f_f_ManOWar_6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Integer> pirateShipStatus = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warshipStatus = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());

        int maxHP= Integer.parseInt(scanner.nextLine());

        String inputCommand=scanner.nextLine();


        while (!inputCommand.equals("Retire")){
            String[] commandParts=inputCommand.split(" ");
            String commandWord=commandParts[0];

            switch (commandWord){
                case "Fire":
                    int indexFire=Integer.parseInt(commandParts[1]);
                    int damageFire=Integer.parseInt(commandParts[2]);

                    if(indexFire>=0 && indexFire<warshipStatus.size()){
                        warshipStatus.set(indexFire,warshipStatus.get(indexFire)-damageFire);

                        if(warshipStatus.get(indexFire)<=0){
                            System.out.println("You won! The enemy ship has sunken.");
                        return;
                        }
                    }

                    break;
                case "Defend":
                    int startIndex=Integer.parseInt(commandParts[1]);
                    int endIndex=Integer.parseInt(commandParts[2]);
                    int damageDefend=Integer.parseInt(commandParts[3]);

                    if(startIndex>=0 &&startIndex<pirateShipStatus.size()&&endIndex>=0 && endIndex<pirateShipStatus.size()){
                        for(int strIndex=startIndex;strIndex<=endIndex;strIndex++){
                            int hpIndex=pirateShipStatus.get(strIndex);
                            int hpForShip=hpIndex-damageDefend;
                            pirateShipStatus.set(strIndex,hpForShip);
                            if(pirateShipStatus.get(strIndex)<=0){
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }

                    break;

                case "Repair":
                    int indexHealth=Integer.parseInt(commandParts[1]);
                    int healthHP=Integer.parseInt(commandParts[2]);

                    if(indexHealth>=0 && indexHealth<pirateShipStatus.size()){

                        int health=Math.min(maxHP, pirateShipStatus.get(indexHealth)+healthHP);
                        pirateShipStatus.set(indexHealth,health);
                    }

                    break;
                case "Status":
                    double parcent =1.00*maxHP/100*20;

                    int count=0;
                    for(int elements:pirateShipStatus){
                        if(elements<parcent){
                            count++;
                        }
                    }

                    System.out.printf("%d sections need repair.\n",count);
                    break;

            }





            inputCommand=scanner.nextLine();
        }




        int statusPirateShip=pirateShipStatus.stream().mapToInt(Integer::intValue).sum();
        int statuswarShip=warshipStatus.stream().mapToInt(Integer::intValue).sum();

        System.out.printf("Pirate ship status: %d\n",statusPirateShip);
        System.out.printf("Warship status: %d\n",statuswarShip);

    }
}
