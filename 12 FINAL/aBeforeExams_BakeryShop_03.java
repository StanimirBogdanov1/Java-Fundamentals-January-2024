package L_FINAL_EXAM_oldsExe_11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class aBeforeExams_BakeryShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();



        Map<String ,Integer> foodMap= new LinkedHashMap<>();

        int soldFood=0;
        // Complete
        while (!input.equals("Complete")){
            String[] inputParts= input.split("\\s+");
            String commandName=inputParts[0];

            switch (commandName){
                // "Receive {quantity} {food}"
                case "Receive":
                    int quantity = Integer.parseInt(inputParts[1]);
                    String food = inputParts[2];

                    if(quantity>0){

                        if (!foodMap.containsKey(food)) {
                            foodMap.put(food, quantity);
                        } else {
                            int existingQuantity = foodMap.get(food);
                            foodMap.put(food, existingQuantity + quantity);
                        }
                    }


                    break;
                case "Sell":
//Sell {quantity} {food}
                    int quantitySell= Integer.parseInt(inputParts[1]);
                    String foodSell = inputParts[2];


                    if(!foodMap.containsKey(foodSell)){
                        System.out.printf("You do not have any %s.\n",foodSell);
                    }else{
                        int existingQuantity=foodMap.get(foodSell);
                        if(quantitySell>existingQuantity){
                            soldFood+=existingQuantity;
                            foodMap.remove(foodSell);
                            System.out.printf("There aren't enough %s. You sold the last %d of them.\n",foodSell,existingQuantity);
                        }else{
                            int existQuantity=foodMap.get(foodSell);
                            foodMap.put(foodSell,existQuantity-quantitySell);
                            soldFood+=quantitySell;
                            System.out.printf("You sold %d %s.\n",quantitySell,foodSell);

                            int quantityFood = foodMap.get(foodSell);
                            if(quantityFood<=0){
                                foodMap.remove(foodSell);
                            }
                        }



                    }

                    break;
            }





            input = scanner.nextLine();
        }

        for(Map.Entry<String ,Integer> pair: foodMap.entrySet()){
            //{food2}: {quantity}
            String food =pair.getKey();
            int quantity = pair.getValue();

            System.out.printf("%s: %d\n",food,quantity);
        }

        System.out.printf("All sold: %d goods\n",soldFood);


    }
}
