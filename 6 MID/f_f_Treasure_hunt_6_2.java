package F_MID_Exams;

import java.util.*;
import java.util.stream.Collectors;

public class f_f_Treasure_hunt_6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        // NE E DOBRE
        List<String> itemsList= Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String command=scanner.nextLine();

        List<String> updateList=new ArrayList<>();

        while (!command.contains("Yohoho!")){
            List<String> commandParts= Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String commandFirst=commandParts.get(0);


            switch (commandFirst){
                case "Loot":
                    commandParts.remove(commandFirst);
                    for(String elements:commandParts){
                        if(!itemsList.contains(elements)){
                            itemsList.add(0,elements);
                        }
                    }

                    break;
                case "Drop":
                    int index=Integer.parseInt(commandParts.get(1));

                    if(index>=0 && index<itemsList.size()) {
                        String item = itemsList.get(index);
                        itemsList.remove(item);
                        itemsList.add(item);
                    }


                    break;
                case "Steal":
                    int stealItems=Integer.parseInt(commandParts.get(1));

                    for(int position=itemsList.size()-1;position>stealItems+1;position--){
                        String currentItem=itemsList.get(position);
                        itemsList.remove(position);
                        updateList.add(currentItem);
                    }


                    break;
            }


            command=scanner.nextLine();
        }


        if(updateList.isEmpty()){

            System.out.println(String.join(", ",itemsList));
            System.out.println("Failed treasure hunt.");
        }else{
            System.out.println(String.join(", ",updateList));
            Collections.reverse(itemsList);
        }


    }
}
