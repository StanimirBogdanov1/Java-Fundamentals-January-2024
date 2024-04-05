package L_FINAL_EXAM_oldsExe_11;

import java.util.Scanner;

public class b_WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);



        String input =scanner.nextLine();

        String command =scanner.nextLine();
        while (!command.equals("Travel")){

            String[] commandParts=command.split(":");
            String commandName = commandParts[0];

            switch (commandName) {
                //Add Stop:{index}:{string}":
                case "Add Stop":
                    int index =Integer.parseInt(commandParts[1]);
                    String newString = commandParts[2];

                    if(index>=0 && index<input.length()) {
                        StringBuilder insertBuilder = new StringBuilder(input);
                        insertBuilder.insert(index, newString);
                        input = insertBuilder.toString();


                    }
                    System.out.println(input);

                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);

                    if(startIndex>=0 && endIndex<input.length()) {
                        StringBuilder removeBuilder = new StringBuilder(input);
                        removeBuilder.delete(startIndex, endIndex+1);
                        input = removeBuilder.toString();

                    }
                    System.out.println(input);
                    break;
                case "Switch":
                    String oldString = commandParts[1];
                    String updateString = commandParts[2];


                    if(input.contains(oldString)){
                        input= input.replace(oldString,updateString);

                    }
                    System.out.println(input);

                    break;


            }





            command =scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s\n",input);



    }
}
