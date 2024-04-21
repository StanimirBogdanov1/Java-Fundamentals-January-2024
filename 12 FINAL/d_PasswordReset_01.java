package L_FINAL_EXAM_oldsExe_11;

import java.util.Scanner;

public class d_PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input =scanner.nextLine();


        String command = scanner.nextLine();

        while (!command.equals("Done")){
            String[] commandParts = command.split("\\s+");
            String commandName = commandParts[0];

            switch (commandName){
                case "TakeOdd":
                    StringBuilder oddLettersBuilder = new StringBuilder();

                    for(int index=0;index<input.length();index++){
                        char symbol = input.charAt(index);

                        if(index%2==1){
                            oddLettersBuilder.append(symbol);
                        }

                    }
                    input=oddLettersBuilder.toString();
                    System.out.println(input);


                    break;
                case "Cut":
                    int index = Integer.parseInt(commandParts[1]);
                    int length =Integer.parseInt(commandParts[2]);
                    int endIndex = index+length;

                    StringBuilder cutBuilder = new StringBuilder(input);
                    cutBuilder.delete(index,endIndex);
                    input= cutBuilder.toString();
                    System.out.println(input);



                    break;
                case "Substitute":
                    String substring = commandParts[1];
                    String substitute = commandParts[2];

                    if(input.contains(substring)) {
                        input = input.replace(substring, substitute);
                        System.out.println(input);
                    }else{
                        System.out.println("Nothing to replace!");
                    }

                    break;

            }


            command = scanner.nextLine();
        }


        System.out.printf("Your password is: %s\n",input);

    }
}
