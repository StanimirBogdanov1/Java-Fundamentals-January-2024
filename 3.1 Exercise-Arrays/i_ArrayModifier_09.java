package CC_ArraysExercise_3_1;

import java.util.Arrays;
import java.util.Scanner;

public class i_ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int[] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String commands=scanner.nextLine();

        while(!commands.equals("end")){

            if(commands.contains("swap")){
                int index1 = Integer.parseInt(commands.split(" ")[1]);
                int index2 = Integer.parseInt(commands.split(" ")[2]);

                int firstIndexNumber=numbers[index1];
                int secondIndexNumber=numbers[index2];

                numbers[index1]=secondIndexNumber;
                numbers[index2]=firstIndexNumber;

            }else if (commands.contains("multiply")){
                int index1 =Integer.parseInt(commands.split(" ")[1]);
                int index2 =Integer.parseInt(commands.split(" ")[2]);

                int firstIndexNumber=numbers[index1];
                int secondIndexNumber=numbers[index2];

                int product=firstIndexNumber*secondIndexNumber;

                numbers[index1]=product;

            }else if(commands.contains("decrease")){

                for(int index=0;index<=numbers.length-1;index++){
                    int currentNumber=numbers[index];
                    numbers[index]=currentNumber-1;
                }




            }




            commands=scanner.nextLine();
        }


        System.out.println(Arrays.toString(numbers).replace("[","").replace("]",""));




    }
}
