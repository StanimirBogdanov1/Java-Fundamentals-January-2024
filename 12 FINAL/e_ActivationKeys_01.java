package L_FINAL_EXAM_oldsExe_11;

import java.util.Scanner;

public class e_ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String inputKey=scanner.nextLine();//

        StringBuilder inputKeyBuilder = new StringBuilder(inputKey);

        String inputComand=scanner.nextLine();//


        while(!inputComand.equals("Generate")){//
            String[] inputCommandParts=inputComand.split(">>>");
            String firstPart=inputCommandParts[0];

            if(firstPart.equals("Contains")){
                String searchString = inputCommandParts[1];
                String cointainsString= inputKeyBuilder.toString();
                boolean isFound=cointainsString.contains(searchString);
                if(isFound){
                    System.out.printf("%s contains %s\n",inputKey,searchString);
                }else {
                    System.out.println("Substring not found!");
                }

            }else if(firstPart.equals("Flip")){
                String letterComamand=inputCommandParts[1];
                if(letterComamand.equals("Upper")){
                    int startIndex=Integer.parseInt(inputCommandParts[2]);
                    int endIndex=Integer.parseInt(inputCommandParts[3]);
                    String getString=inputKeyBuilder.substring(startIndex,endIndex).toUpperCase();

                    inputKeyBuilder.delete(startIndex,endIndex);
                    inputKeyBuilder.insert(startIndex,getString);

                    System.out.println(inputKeyBuilder.toString());


                }else if(letterComamand.equals("Lower")){
                    int startIndex=Integer.parseInt(inputCommandParts[2]);
                    int endIndex=Integer.parseInt(inputCommandParts[3]);
                    String getString=inputKeyBuilder.substring(startIndex,endIndex).toLowerCase();

                    inputKeyBuilder.delete(startIndex,endIndex);
                    inputKeyBuilder.insert(startIndex,getString);

                    System.out.println(inputKeyBuilder.toString());

                }
            }else if (firstPart.equals("Slice")){
                int startIndex=Integer.parseInt(inputCommandParts[1]);
                int endIndex=Integer.parseInt(inputCommandParts[2]);

                inputKeyBuilder.delete(startIndex,endIndex);

                System.out.println(inputKeyBuilder);
            }



            inputComand=scanner.nextLine();//
        }//

        System.out.printf("Your activation key is: %s\n",inputKeyBuilder.toString());



    }
}
