package L_FINAL_EXAM_oldsExe_11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class e_e_e_Pirates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        String input=scanner.nextLine();


        LinkedHashMap<String,Integer> cityPopulationMap=new LinkedHashMap<>();
        LinkedHashMap<String,Integer> cityGoldMap=new LinkedHashMap<>();

        while(!input.equals("Sail")){
            String[] inputParts = input.split("[\\|\\|]+");
            String city=inputParts[0];
            int population=Integer.parseInt(inputParts[1]);
            int gold=Integer.parseInt(inputParts[2]);

            if(!cityPopulationMap.containsKey(city)){
                cityPopulationMap.put(city,population);
                cityGoldMap.put(city,gold);
            }else{
                int existingPopulation= cityPopulationMap.get(city);
                int existingGold=cityGoldMap.get(city);
                cityPopulationMap.put(city,existingPopulation+population);
                cityGoldMap.put(city,existingGold+gold);
            }



            input=scanner.nextLine();
        }



        String eventStartInput=scanner.nextLine();

        while(!eventStartInput.equals("End")){
            String[] eventStartInputParts=eventStartInput.split("=>");
            String command=eventStartInputParts[0];


            if(command.equals("Plunder")){
                String cityDestroy=eventStartInputParts[1];
                int populationkill = Integer.parseInt(eventStartInputParts[2]);
                int goldGet = Integer.parseInt(eventStartInputParts[3]);
                int existingPeople=cityPopulationMap.get(cityDestroy);
                int existingGold=cityGoldMap.get(cityDestroy);

                    cityPopulationMap.put(cityDestroy,existingPeople-populationkill);
                    cityGoldMap.put(cityDestroy,existingGold-goldGet);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n",cityDestroy,goldGet,populationkill);

                if(cityPopulationMap.get(cityDestroy)<=0|| cityGoldMap.get(cityDestroy)<=0) {
                    cityPopulationMap.remove(cityDestroy);
                    cityGoldMap.remove(cityDestroy);
                    System.out.printf("%s has been wiped off the map!\n",cityDestroy);
                }


            }else if (command.equals("Prosper")){
                String[] commandPart=eventStartInput.split("=>");
                String cityBonusGold=commandPart[1];
                int bonusGold=Integer.parseInt(commandPart[2]);

                if(bonusGold<0){
                    System.out.println("Gold added cannot be a negative number!");
                }else{
                    int existingGold=cityGoldMap.get(cityBonusGold);
                    cityGoldMap.put(cityBonusGold,existingGold+bonusGold);
                    System.out.printf("%d gold added to the city treasury. %s now has %s gold.\n",bonusGold,cityBonusGold,cityGoldMap.get(cityBonusGold));
                }

            }



            eventStartInput=scanner.nextLine();
        }




        int lengthMap=cityPopulationMap.size();

        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n",lengthMap);

        for(Map.Entry<String,Integer> pair:cityPopulationMap.entrySet()){

            System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n",pair.getKey(),pair.getValue(),cityGoldMap.get(pair.getKey()));
        }

        System.out.println();


    }
}
