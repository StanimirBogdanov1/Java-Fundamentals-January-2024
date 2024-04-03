package L_FINAL_EXAM_oldsExe_11;

import java.util.*;


public class b_b_b_PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numberPlants=Integer.parseInt(scanner.nextLine());


        Map<String,Integer> plantMap = new LinkedHashMap<>();
        Map <String, List<Double>> plantRaitingMap=new LinkedHashMap<>();

        for(int number=1;number<=numberPlants;number++){
            String plant=scanner.nextLine();

            String[] plantAndRarityParts = plant.split("<->");
            String name = plantAndRarityParts[0];
            int rarity =Integer.parseInt(plantAndRarityParts[1]);

            plantMap.put(name,rarity);
            plantRaitingMap.put(name,new ArrayList<>());


        }

        String command=scanner.nextLine();



        while(!command.equals("Exhibition")){
            String[] commandPartsForName=command.split("[: -]+ ");
            String commandName=commandPartsForName[0];
            String name=commandPartsForName[1];


            boolean isValid=commandName.equals("Rate")||commandName.equals("Update")||commandName.equals("Reset");

            if(!plantMap.containsKey(name)|| !isValid){
                System.out.println("error");
            } else if(commandName.equals("Rate")){
                double raiting =Integer.parseInt(commandPartsForName[2]);

                plantRaitingMap.get(name).add(raiting);





            }else if(commandName.equals("Update")){

                int rarity =Integer.parseInt(commandPartsForName[2]);

                plantMap.put(name,rarity);

            }else if(commandName.equals("Reset")){


                plantRaitingMap.get(name).clear();



            }




            command=scanner.nextLine();
        }


        System.out.println("Plants for the exhibition:");





        for(Map.Entry<String,List<Double>> pair:plantRaitingMap.entrySet()){
            String name= pair.getKey();
            int rarity= plantMap.get(name);
            List<Double> rating = plantRaitingMap.get(name);

            if(rating.size()==0){
                System.out.printf("- %s; Rarity: %d; Rating: 0.00\n",name,rarity);
            }else {
                int totalRating=0;
                for(double value:rating){
                    totalRating+=value;
                }

                double averageRating=totalRating*1.00/rating.size();
                System.out.printf("- %s; Rarity: %d; Rating: %.2f\n",name,rarity,averageRating);
            }


        }

//        for (Map.Entry<String, Integer> entry : plantMap.entrySet()) {
//            String name = entry.getKey();
//            int rarity = entry.getValue();
//            List<Double> plantRatings = plantRaitingMap.get(name);
//            double sum = 0;
//            for (double plantRating : plantRatings) {
//                sum += plantRating;
//            }
//            double averageRating = plantRatings.isEmpty() ? 0.00 : sum / plantRatings.size();
//            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", name, rarity, averageRating);
//        }



    }
}
