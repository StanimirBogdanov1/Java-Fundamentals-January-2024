package F_MID_Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class d_d_ShoppingList_4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<String> groceriesList= Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String command=scanner.nextLine();

        while(!command.equals("Go Shopping!")){
            String[] commandParts=command.split(" ");
            String commandWordPart=commandParts[0];
            String itemPart=commandParts[1];

            switch (commandWordPart){
                case "Urgent":
                    if(!groceriesList.contains(itemPart)){
                        groceriesList.add(0,itemPart);
                    }

                    break;
                case "Unnecessary":
                    groceriesList.remove(itemPart);
                    break;
                case "Correct":
                    String newNamePart=commandParts[2];
                    if(groceriesList.contains(itemPart)){
                        groceriesList.set(groceriesList.indexOf(itemPart),newNamePart);
                    }
                    break;
                case "Rearrange":
                    if(groceriesList.contains(itemPart)){
                        groceriesList.remove(itemPart);
                        groceriesList.add(itemPart);

                    }
                    break;


            }



            command=scanner.nextLine();
        }


        System.out.println(String.join(", ",groceriesList));


    }
}
