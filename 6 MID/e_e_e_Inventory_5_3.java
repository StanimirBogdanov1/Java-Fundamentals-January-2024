package F_MID_Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e_e_e_Inventory_5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<String> itemsList= Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command=scanner.nextLine();

        while(!command.equals("Craft!")){
            String[] commandParts=command.split(" - ");
            String commandWord=commandParts[0];
            String item=commandParts[1];

            switch (commandWord){
                case "Collect":
                   // String itemAdd=commandParts[1];

                    if(!itemsList.contains(item)){
                        itemsList.add(item);
                    }

                    break;
                case "Drop":
                   // String itemRemove=commandParts[1];
                    itemsList.remove(item);
                    break;
                case "Combine Items":
                    String oldItem=item.split(":")[0];
                    String newItem=item.split(":")[1];

                    if(itemsList.contains(oldItem)){

                        int index=itemsList.indexOf(oldItem);
                        itemsList.add(index+1,newItem);
                    }

                    break;
                case "Renew":

                    if(itemsList.contains(item)){
                        itemsList.remove(item);
                        itemsList.add(item);
                    }

                    break;
            }


            command=scanner.nextLine();
        }


        System.out.println(String.join(", ",itemsList));


    }
}
