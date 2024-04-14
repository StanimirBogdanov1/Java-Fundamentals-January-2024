package L_FINAL_EXAM_oldsExe_11;

import java.util.Scanner;

public class c_SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String inputMessage=scanner.nextLine();

        String command = scanner.nextLine();

        while (!command.equals("Reveal")){
            String[] commandParts = command.split(":\\|:");
            String commandName = commandParts[0];

            switch (commandName){
                case"InsertSpace":
                    int indexSpace = Integer.parseInt(commandParts[1]);

                    StringBuilder insertSpaceBuilder = new StringBuilder(inputMessage);
                    insertSpaceBuilder.insert(indexSpace," ");
                    inputMessage=insertSpaceBuilder.toString();
                    System.out.println(inputMessage);
                    break;
                case"Reverse":
                    String subString = commandParts[1];

                    if(inputMessage.contains(subString)){
                        inputMessage = inputMessage.replaceFirst(subString,"");

                        StringBuilder reverseText = new StringBuilder(subString);
                        reverseText.reverse();
                        StringBuilder newText = new StringBuilder(inputMessage);
                        newText.append(reverseText);
                        inputMessage= newText.toString();
                        System.out.println(inputMessage);


                    }else{
                        System.out.println("error");
                    }

                    break;
                case"ChangeAll":
                    String subStr = commandParts[1];
                    String replacement = commandParts[2];

                    inputMessage = inputMessage.replace(subStr,replacement);
                    System.out.println(inputMessage);

                    break;
            }


            command = scanner.nextLine();
        }


        System.out.printf("You have a new text message: %s\n",inputMessage);


    }
}
