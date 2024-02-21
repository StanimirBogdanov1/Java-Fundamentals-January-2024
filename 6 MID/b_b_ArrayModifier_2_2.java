package F_MID_Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class b_b_ArrayModifier_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        List<Integer> numberList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        String command=scanner.nextLine();

        while(!command.equals("end")){

            String[] commandParts=command.split(" ");
            String commandPartFirst=commandParts[0];

            switch (commandPartFirst){
                case "swap":
                    int commandPartFirstIndex=Integer.parseInt(commandParts[1]);
                    int commandPartSecondIndex=Integer.parseInt(commandParts[2]);

                    int firstElement=numberList.get(commandPartFirstIndex);
                    int secondElement =numberList.get(commandPartSecondIndex);

                    numberList.set(commandPartFirstIndex,secondElement);
                    numberList.set(commandPartSecondIndex,firstElement);


                    break;
                case "multiply":
                    int commandFirstIndex=Integer.parseInt(commandParts[1]);
                    int commandSecondIndex=Integer.parseInt(commandParts[2]);

                    int product=numberList.get(commandFirstIndex)*numberList.get(commandSecondIndex);


                    numberList.set(commandFirstIndex,product);

                    break;
                case "decrease":
                    for(int i=0;i<numberList.size();i++){

                        numberList.set(i,(numberList.get(i)-1));

                    }

                    break;


            }





            command=scanner.nextLine();
        }

        System.out.println(numberList.toString().replace("[","").replace("]","").trim());







    }
}
