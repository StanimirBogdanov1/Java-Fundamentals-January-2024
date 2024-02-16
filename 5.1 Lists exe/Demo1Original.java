package EE_List_Exe_5_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo1Original {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        //Намиране на сума от Всички числа на даден List без обхождане !

     List<Integer> testList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

     int sum= testList.stream().mapToInt(Integer::intValue).sum();     // <<-- това е


        System.out.println(sum);

        /* Обобщение на (-  testList.stream().mapToInt(Integer::intValue).sum(); -)    -> Върху списъка (testList)
        извикваме метода stream..След това преобразуваме Големите Integers към малки int и намираме тяхната сума

         */
    }
}
