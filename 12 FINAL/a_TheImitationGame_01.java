package L_FINAL_EXAM_oldsExe_11;

import java.util.Scanner;

public class a_TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String inputCode=scanner.nextLine();

        String command=scanner.nextLine();

        while(!command.equals("Decode")){
            String[] commandParts=command.split("\\|");
                String nameComand=commandParts[0];

                switch (nameComand){
                    case "Move":
                        int numberLetterCommand=Integer.parseInt(commandParts[1]);
                        String firstPart=inputCode.substring(0,numberLetterCommand);
                        inputCode=inputCode.replace(firstPart,"");
                        StringBuilder moveBuilder = new StringBuilder(inputCode);
                        inputCode=moveBuilder.append(firstPart).toString();
                        break;
                    case "Insert":
                        int numberIndexCommand=Integer.parseInt(commandParts[1]);
                        String newString =commandParts[2];

                        StringBuilder insertBuilder= new StringBuilder(inputCode);
                        insertBuilder.insert(numberIndexCommand,newString);
                        inputCode=insertBuilder.toString();

                        break;
                    case "ChangeAll":
                        String oldString=commandParts[1];
                        String newStringForChange=commandParts[2];
                        inputCode=inputCode.replace(oldString,newStringForChange);
                        break;
                }




            command=scanner.nextLine();
        }


        System.out.println("The decrypted message is: "+inputCode);


    }
}
