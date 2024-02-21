package F_MID_Exams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);




        List<Integer> numList = new ArrayList<>(Arrays.asList( 56, 45, 65, 44, 334, 65, 43, 23, 56, 76, 43) );

        int valueFromIndex2 =numList.get(3); //Вземане на число от индекс и се присвоява
        int valueFromIndex =numList.get(2); //Вземане на число от индекс и се присвоява
        int getIndex= numList.indexOf(65); // Вземане индекс от число и се присвоява
        int getValue= numList.get(numList.indexOf(65));    //  Вземане на число от индекс (Вземане индекс от число)


        System.out.println(valueFromIndex2);
        System.out.println(valueFromIndex);
        System.out.println(getIndex);
        System.out.println(getValue);



    }
}
