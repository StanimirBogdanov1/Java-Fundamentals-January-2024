package F_MID_Exams;

import java.util.Arrays;
import java.util.Scanner;

public class e_e_MuOnline_5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String[] dungeonMobs= scanner.nextLine().split("\\|");

        int initialHP=100;
        int bitcoin=0;
        int count=0;

        for(int indexRoom=0;indexRoom<=dungeonMobs.length-1;indexRoom++){
            String command=dungeonMobs[indexRoom];
            String commandPartFirst=command.split(" ")[0];
            int commandPartSecond=Integer.parseInt(command.split(" ")[1]);

            count++;

            switch (commandPartFirst){
                case "potion":

                    int hp=initialHP;
                    initialHP=initialHP+commandPartSecond;
                    if(initialHP>100){
                        initialHP=100;
                        commandPartSecond=initialHP-hp;
                    }
                    System.out.printf("You healed for %d hp.\n",commandPartSecond);
                    System.out.printf("Current health: %d hp.\n",initialHP);

                    break;
                case "chest":
                    bitcoin+=commandPartSecond;
                    System.out.printf("You found %d bitcoins.\n",commandPartSecond);
                    break;
                default:

                    initialHP-=commandPartSecond;

                    if(initialHP>0){
                        System.out.printf("You slayed %s.\n",commandPartFirst);
                    }else{
                        System.out.printf("You died! Killed by %s.\n",commandPartFirst);
                        System.out.printf("Best room: %d\n",count);
                        return;
                    }


                    break;
            }






        }

        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d\n",bitcoin);
        System.out.printf("Health: %d\n",initialHP);


    }
}
