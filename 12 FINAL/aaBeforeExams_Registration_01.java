package L_FINAL_EXAM_oldsExe_11;

import java.util.Scanner;

public class aaBeforeExams_Registration_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String inputName=scanner.nextLine();

        String commands = scanner.nextLine();

        while (!commands.equals("Registration")){
            String[] commandParts = commands.split("\\s+");
            String commandName=commandParts[0];

            switch (commandName){
                case "Letters":
                    String loverOrUpper = commandParts[1];

                    if(loverOrUpper.equals("Lower")){
                        inputName=inputName.toLowerCase();
                        System.out.println(inputName);

                    }else if(loverOrUpper.equals("Upper")){
                        inputName=inputName.toUpperCase();
                        System.out.println(inputName);
                    }

                    break;
                case "Reverse":
                    int startIndex=Integer.parseInt(commandParts[1]);
                    int endIndex=Integer.parseInt(commandParts[2]);

                    if(startIndex>=0 && endIndex>=0 && startIndex<inputName.length()&& endIndex<inputName.length()) {
                        String substring = inputName.substring(startIndex, endIndex + 1);
                        StringBuilder reversBuilder = new StringBuilder(substring);

                        reversBuilder.reverse();
                        String reversedSubstring = reversBuilder.toString();

                        System.out.println(reversedSubstring);
                    }


                    break;
                case "Substring":
                    String subString =commandParts[1];

                    if(inputName.contains(subString)){


                        inputName=inputName.replace(subString,"");
                        System.out.println(inputName);

                    }else{
                        System.out.printf("The username %s doesn't contain %s.\n",inputName,subString);
                    }


                    break;
                case "Replace":
                    char symbol= commandParts[1].charAt(0);

                    inputName = inputName.replace(symbol, '-');
                    System.out.println(inputName);

                    break;
                case "IsValid":
                    char containSymbol= commandParts[1].charAt(0);

                    if(inputName.contains(containSymbol+"")){
                        System.out.println("Valid username.");
                    }else{
                        System.out.printf("%c must be contained in your username.\n",containSymbol);
                    }

                    break;
            }




            commands = scanner.nextLine();
        }




    }
}
