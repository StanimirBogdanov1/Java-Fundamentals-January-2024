package F_MID_Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class a_a_a_MemoryGame_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<String> startList= Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command=scanner.nextLine();


        int numberCount=0;
        while(!command.equals("end")){

            int firstIndexElement=Integer.parseInt(command.split(" ")[0]);
            int secondIndexElement=Integer.parseInt(command.split(" ")[1]);
            numberCount++;
            int size=startList.size();
            if(firstIndexElement==secondIndexElement || firstIndexElement<0 || firstIndexElement>=size||
                    secondIndexElement<0 || secondIndexElement>=size){
                String firstAdd="-"+numberCount+"a";
                String secondAdd="-"+numberCount+"a";

                startList.add(startList.size()/2,firstAdd);
                startList.add(startList.size()/2,secondAdd);

                System.out.println("Invalid input! Adding additional elements to the board");
            }else {
                String firstElement=startList.get(firstIndexElement);
                String secondElement=startList.get(secondIndexElement);
                if (firstElement.equals(secondElement)) {
                    System.out.printf("Congrats! You have found matching elements - %s!\n", startList.get(firstIndexElement));
                    startList.remove(String.valueOf(firstElement));
                    startList.remove(String.valueOf(secondElement));
                }else{
                    System.out.println("Try again!");
                }

            }
            if(startList.isEmpty()){
                System.out.printf("You have won in %d turns!\n",numberCount);
                return;
            }



            command=scanner.nextLine();
        }


        if(!startList.isEmpty()){
            System.out.printf("Sorry you lose :(\n");
        }


        System.out.println(String.join(" ",startList));

    }
}
