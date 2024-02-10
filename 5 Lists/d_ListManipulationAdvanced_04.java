package E_Lists_5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class d_ListManipulationAdvanced_04 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);

            List<Integer> numberStringList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

            String command=scanner.nextLine();

            while(!command.equals("end")){
                String[] commandParts=(command.split(" "));
                String commandName=commandParts[0];

                switch (commandName){
                    case "Add":
                        int newNum=Integer.parseInt(commandParts[1]);
                        numberStringList.add(newNum);

                        break;
                    case "Remove":
                        int removeNumberFromIndex=Integer.parseInt(commandParts[1]);
                        numberStringList.remove(Integer.valueOf(removeNumberFromIndex));
                        break;
                    case "RemoveAt":
                        int indexForRemovee=Integer.parseInt(commandParts[1]);
                        numberStringList.remove(indexForRemovee);
                        break;
                    case "Insert":
                        int insertNumber=Integer.parseInt(commandParts[1]);
                        int insertIndex=Integer.parseInt(commandParts[2]);
                        numberStringList.add(insertIndex,insertNumber);

                        break;

                }
                command=scanner.nextLine();
            }

            for(int elements:numberStringList) {

                System.out.print(elements+" ");
            }
    }
}
