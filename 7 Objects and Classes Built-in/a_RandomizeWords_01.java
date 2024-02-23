package HHH_ObjectsandClasses_Built_in_7;

import java.util.Random;
import java.util.Scanner;

public class a_RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String input=scanner.nextLine();
        String[] inputArr=input.split("\\s+");


        Random rnd=new Random();

        for(int position=0;position<inputArr.length;position++){
            int rndIndexX=rnd.nextInt(inputArr.length);
            int rndIndexY=rnd.nextInt(inputArr.length);

            String oldIndex=inputArr[rndIndexX];
            inputArr[rndIndexX]=inputArr[rndIndexY];
            inputArr[rndIndexY]=oldIndex;
       }


        for(String elements:inputArr){

            System.out.println(elements);
        }

    }
}
