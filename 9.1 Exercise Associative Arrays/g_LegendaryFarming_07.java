package I_I_ExerciseAssociativeArrays_8_1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class g_LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);



        boolean isLegendaryItemBought=false;

        Map<String,Integer> legendaryItemsMap=new LinkedHashMap<>();
        legendaryItemsMap.put("shards",0);
        legendaryItemsMap.put("fragments",0);
        legendaryItemsMap.put("motes",0);

        Map<String,Integer> junkMap=new LinkedHashMap<>();

        while (!isLegendaryItemBought){
            String input=scanner.nextLine();
            String[] inputData=input.split(" ");   //  6 leathers 255 fragments 7 Shards

            for(int index=0;index<inputData.length;index+=2){
                int quantity=Integer.parseInt(inputData[index].toLowerCase());
                String material=inputData[index+1].toLowerCase();


                if(material.equals("shards") || material.equals("fragments") || material.equals("motes")){
                    int existQuantity=legendaryItemsMap.get(material);
                    legendaryItemsMap.put(material,existQuantity+quantity);
                }else{
                    if(junkMap.containsKey(material)){
                        int existQuantity=junkMap.get(material);
                        junkMap.put(material,existQuantity+quantity);
                    }else{
                        junkMap.put(material,quantity);

                    }
                }

                for(Map.Entry<String,Integer> pair : legendaryItemsMap.entrySet()){
                    int totalFarm=pair.getValue();

                    if(totalFarm>=250){
                        isLegendaryItemBought=true;
                        if(pair.getKey().equals("shards")){
                            System.out.printf("Shadowmourne obtained!\n");
                        }else if(pair.getKey().equals("fragments")){
                            System.out.printf("Valanyr obtained!\n");
                        }else if(pair.getKey().equals("motes")){
                            System.out.printf("Dragonwrath obtained!\n");
                        }
                        int newQuantity=pair.getValue()-250;
                        legendaryItemsMap.put(material,newQuantity);
                    }


                }

                if(isLegendaryItemBought){
                    break;
                }



            }



        }


        legendaryItemsMap.entrySet().forEach( entry -> System.out.printf(" %s: %d\n",entry.getKey(),entry.getValue()));
        junkMap.entrySet().forEach( entry -> System.out.printf(" %s: %d\n",entry.getKey(),entry.getValue()));

    }
}
