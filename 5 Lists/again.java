package E_Lists_5;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        List<Integer> numberStringList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command=scanner.nextLine();

        while(!command.equals("end")){
            String[] commandPart=command.split(" ");
            String fromCommant=commandPart[0];

            switch (fromCommant){
                case "Add":
                    int num=Integer.parseInt(commandPart[1]);
                    numberStringList.add(num);
                    break;
                case "Remove":

                    break;



            }




            command=scanner.nextLine();
        }

    }
}
