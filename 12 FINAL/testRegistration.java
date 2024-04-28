package L_FINAL_EXAM_oldsExe_11;

import java.util.Scanner;

public class testRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String username = scanner.nextLine();
        StringBuilder sb = new StringBuilder(username);
        String command = scanner.nextLine();
        while(!command.equals("Registration")) {

            String [] commandParts =command.split("\\s+");
            String commandName = commandParts[0];
            switch (commandName) {
                case  "Letters":
                    String type = commandParts[1];
                    //Letters {Lower/Upper}
                    if(type.equals("Lower")) {
                        sb = new StringBuilder(sb.toString().toLowerCase());
                    } else if (type.equals("Upper")) {
                        sb = new StringBuilder(sb.toString().toUpperCase());
                    }
                    System.out.println(sb);
                    break;
                case  "Reverse":
                    //Reverse {startIndex} {endIndex}
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int endIndex = Integer.parseInt(commandParts[2]);

                    if(startIndex>=0 && endIndex>=0 && startIndex<username.length()&& endIndex<username.length()) {
                        String substring = username.substring(startIndex, endIndex + 1);
                        StringBuilder reversBuilder = new StringBuilder(substring);

                        reversBuilder.reverse();
                        String reversedSubstring = reversBuilder.toString();

                        System.out.println(reversedSubstring);
                    }
                    break;
                case  "Substring":
                    //Substring {substring}
                    String substring = commandParts[1];
                    int indexOfSub = sb.indexOf(substring);
                    if(username.contains(substring)) {
                        sb.delete(indexOfSub, indexOfSub + substring.length());
                        System.out.println(sb);
                    } else {
                        System.out.printf("The username %s doesn't contain %s.%n", sb,substring);
                    }
                    break;
                case  "Replace":
                    //Replace {char}
                    String symbol = commandParts[1];
                    sb = new StringBuilder(sb.toString().replaceAll(symbol, "-"));
                    System.out.println(sb);
                    break;
                case  "IsValid":
                    //IsValid {char}
                    String charSymbol = commandParts[1];
                    if(sb.indexOf(charSymbol) != -1) {
                        System.out.println("Valid username.");
                    } else {
                        System.out.printf("%s must be contained in your username.%n", charSymbol);
                    }
                    break;

            }
            command = scanner.nextLine();
        }




    }
}
