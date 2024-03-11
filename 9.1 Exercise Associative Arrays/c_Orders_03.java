package I_I_ExerciseAssociativeArrays_8_1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class c_Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

               String input=scanner.nextLine();

        Map<String,Double> itemPriceMap=new LinkedHashMap<>();
        Map<String,Integer> itemQuantityMap=new LinkedHashMap<>();

               while(!input.equals("buy")){
                   String nameItem=input.split(" ")[0];
                   double priceItem=Double.parseDouble(input.split(" ")[1]);
                   int quantityItem=Integer.parseInt(input.split(" ")[2]);

                   if(itemQuantityMap.containsKey(nameItem)){
                       int quantityOld=itemQuantityMap.get(nameItem);
                       itemQuantityMap.put(nameItem,quantityOld+quantityItem);
                   }else{
                       itemQuantityMap.put(nameItem,quantityItem);
                   }

                   itemPriceMap.put(nameItem,priceItem);

                   input=scanner.nextLine();
               }



               for(Map.Entry<String,Integer> pair :itemQuantityMap.entrySet()){

                   String name=pair.getKey();
                   Integer quantity=pair.getValue();
                   double price=itemPriceMap.get(name);


                   System.out.printf("%s -> %.2f\n",name,quantity*price);

               }

    }
}
